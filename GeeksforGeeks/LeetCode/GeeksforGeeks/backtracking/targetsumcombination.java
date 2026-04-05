class Solution {
    public ArrayList<ArrayList<Integer>> targetSumComb(int[] arr, int target) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        backtrack(arr, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] arr, int target, int index,
                           ArrayList<Integer> current,
                           ArrayList<ArrayList<Integer>> result) {

        // base case: target achieved
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // base case: target exceeded
        if (target < 0) return;

        // try each element from current index
        for (int i = index; i < arr.length; i++) {
            current.add(arr[i]);                 // choose
            backtrack(arr, target - arr[i], i, current, result); // reuse allowed
            current.remove(current.size() - 1); // backtrack
        }
    }
}
  