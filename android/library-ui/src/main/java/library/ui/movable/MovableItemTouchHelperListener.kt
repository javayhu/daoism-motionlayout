package library.ui.movable

import androidx.recyclerview.widget.RecyclerView

interface MovableItemTouchHelperListener {

    fun onRowMoved(fromPosition: Int, toPosition: Int)

    fun onRowMoveSelected(viewHolder: RecyclerView.ViewHolder?)

    fun onRowMoveCleared(viewHolder: RecyclerView.ViewHolder?)
}
