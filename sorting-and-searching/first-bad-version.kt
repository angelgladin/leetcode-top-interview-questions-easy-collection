// First Bad Version

class Solution : VersionControl() {
    override fun firstBadVersion(n: Int): Int {
        var start = 1
        var end = n
        while (start < end) {
            val mid = start + (end - start) / 2
            if (!isBadVersion(mid)) start = mid + 1 else end = mid
        }
        return start
    }
}
