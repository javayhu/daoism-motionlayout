package cn.javayhu.daoism.home

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import cn.javayhu.daoism.R
import kotlinx.android.synthetic.main.item_animal.view.*
import library.ui.movable.MovableItemTouchHelperListener
import java.util.*

data class Animal(
    val name: String,
    val index: Int,
    val resource: Int,
    val description: String,
    val target: Intent?
)

class AnimalViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    private var animal: Animal? = null

    init {
        view.setOnClickListener {
            when (animal?.target) {
                null -> {
                    Toast.makeText(
                        view.context,
                        view.context.getString(R.string.waiting),
                        Toast.LENGTH_SHORT
                    ).show()
                }
                else -> view.context.startActivity(animal?.target)
            }
        }
    }

    fun bind(animal: Animal) {
        this.animal = animal
        view.animalTextView.text = this.animal?.name
        this.animal?.resource?.let { view.animalImageView.setImageResource(it) }
    }

    fun onMoveSelected() {
    }

    fun onMoveCleared() {
    }
}

class AnimalAdapter(private var animalList: List<Animal>) :
    RecyclerView.Adapter<AnimalViewHolder>(),
    MovableItemTouchHelperListener {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_animal, parent, false)
        return AnimalViewHolder(view)
    }

    override fun getItemCount(): Int {
        return animalList.size
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        holder.bind(animalList[position])
    }

    override fun onRowMoved(fromPosition: Int, toPosition: Int) {
        if (fromPosition < toPosition) {
            for (i in fromPosition until toPosition) {
                Collections.swap(animalList, i, i + 1)
            }
        } else {
            for (i in fromPosition downTo toPosition + 1) {
                Collections.swap(animalList, i, i - 1)
            }
        }
        notifyItemMoved(fromPosition, toPosition)
    }

    override fun onRowMoveSelected(viewHolder: RecyclerView.ViewHolder?) {
        (viewHolder as AnimalViewHolder).onMoveSelected()
    }

    override fun onRowMoveCleared(viewHolder: RecyclerView.ViewHolder?) {
        (viewHolder as AnimalViewHolder).onMoveCleared()
    }
}