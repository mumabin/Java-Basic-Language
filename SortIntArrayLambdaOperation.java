//1636. Sort Array by Increasing Frequency
//  Array int[] lambda operation

class Solution {
    public int[] frequencySort(int[] nums) {
        if (nums == null) {
            return new int[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
                                            
        Arrays.stream(nums).forEach(num -> map.put(num, map.getOrDefault(num, 0) + 1));
        
        
        // Convert int[] to Integer[]
        // Integer[] input = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        
       return  Arrays.stream(nums).boxed().sorted((a, b) -> map.get(a) != map.get(b) ? map.get(a) - map.get(b) : b - a)
            .mapToInt(n -> n)
            .toArray();
                                
    }
}
