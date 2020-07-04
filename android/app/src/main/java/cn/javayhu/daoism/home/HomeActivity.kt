package cn.javayhu.daoism.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.ItemTouchHelper
import cn.javayhu.daoism.R
import kotlinx.android.synthetic.main.activity_home.*
import library.router.Intents
import library.ui.movable.MovableItemTouchHelperCallback

class HomeActivity : AppCompatActivity(R.layout.activity_home) {

    /**
     * 十二生肖
     * 百科：https://baike.baidu.com/item/%E5%8D%81%E4%BA%8C%E7%94%9F%E8%82%96/48593
     * 图标：https://www.iconfont.cn/collections/detail?spm=a313x.7781069.0.da5a778a4&cid=18254
     */
    private val animalList: List<Animal> by lazy {
        //@formatter:off
        listOf(
            Animal(
                "鼠",
                1,
                R.drawable.ic_animal_1,
                getString(R.string.waiting),
                Intents.openSplashIntent(this)
            ),
            Animal(
                "牛",
                2,
                R.drawable.ic_animal_2,
                getString(R.string.waiting),
                null
            ),
            Animal(
                "虎",
                3,
                R.drawable.ic_animal_3,
                getString(R.string.waiting),
                null
            ),
            Animal(
                "兔",
                4,
                R.drawable.ic_animal_4,
                getString(R.string.waiting),
                null
            ),
            Animal(
                "龙",
                5,
                R.drawable.ic_animal_5,
                getString(R.string.waiting),
                null
            ),
            Animal(
                "蛇",
                6,
                R.drawable.ic_animal_6,
                getString(R.string.waiting),
                null
            ),
            Animal(
                "马",
                7,
                R.drawable.ic_animal_7,
                getString(R.string.waiting),
                null
            ),
            Animal(
                "羊",
                8,
                R.drawable.ic_animal_8,
                getString(R.string.waiting),
                null
            ),
            Animal(
                "猴",
                9,
                R.drawable.ic_animal_9,
                getString(R.string.waiting),
                null
            ),
            Animal(
                "鸡",
                10,
                R.drawable.ic_animal_10,
                getString(R.string.waiting),
                null
            ),
            Animal(
                "狗",
                11,
                R.drawable.ic_animal_11,
                getString(R.string.waiting),
                null
            ),
            Animal(
                "猪",
                12,
                R.drawable.ic_animal_12,
                getString(R.string.waiting),
                null
            )
        )
        //@formatter:on
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        homeMotionLayout.setTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                daoismImageView.animate().rotation(720f).start()
            }

            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {}

            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {}

            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {}
        })

        homeMotionLayout.transitionToEnd()

        toolsRecyclerView.layoutManager = GridLayoutManager(this, 3)
        toolsRecyclerView.adapter =
            AnimalAdapter(animalList)
        toolsRecyclerView.setHasFixedSize(true)

        val itemTouchHelper = ItemTouchHelper(
            MovableItemTouchHelperCallback(
                toolsRecyclerView.adapter as AnimalAdapter
            )
        )
        itemTouchHelper.attachToRecyclerView(toolsRecyclerView)

        settingsImageView.setOnClickListener {

        }
    }
}
