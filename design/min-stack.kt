// Min Stack

class MinStack() {

    private var chunk: Node? = null

    fun push(x: Int) {
        if (chunk != null) {
            chunk = Node(x, chunk).apply { minSoFar = Math.min(chunk!!.minSoFar, x) }
        } else {
            chunk = Node(x)
        }
    }

    fun pop() {
        chunk = chunk!!.next
    }

    fun top(): Int = chunk!!.x

    fun getMin(): Int = chunk!!.minSoFar

    data class Node(val x: Int, val next: Node? = null) {
        var minSoFar: Int = x
    }
}
