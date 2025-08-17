public class Dupllication {
    public static void main(String[] args) {
        int [] arr = {44, 1, 2, 44, 4 };
        int i =0;
        // for(int i =0; i<arr.length; i++){
        //     for(int j = i+1; j<arr.length-i; j++){
        //         if(arr[i] == arr[j]){
        //             System.out.println(arr[i]);
        //         }
      
        //     }
       
        // }

        while(i<arr.length){
            for(int j=i+1; j<arr.length-i; j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
              
            }
            i++;
        }

        
    }
}
