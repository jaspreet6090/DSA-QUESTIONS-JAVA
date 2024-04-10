class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        
   Arrays.sort(deck);
       Queue<Integer> queue =  new LinkedList<>();
      int[] newarr =  new int[deck.length];
       for(int i=0; i<deck.length ; i++){
           queue.add(i);
      
       }
        int i =0;
        while(queue.size() != 0){
             
            int present = queue.poll();
           
            newarr[present] = deck[i];
             
            if (!queue.isEmpty()) {
            int next = queue.poll();
              queue.add(next);

            }
            i++;

      }
return newarr;
    }
}