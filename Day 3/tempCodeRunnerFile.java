 for(int i =0; i<arr.length; i++){
            for(int j = i+1; j<arr.length-i; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
                System.out.println(j);
            }
            System.out.println(i);
        }