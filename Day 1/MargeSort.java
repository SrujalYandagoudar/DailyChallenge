

public class MargeSort {

    public static void con(int arr[], int si, int mid, int ei){
        
        int merge [] = new int[(ei-si+1)];

        int idx1 = si;
        int idx2 = mid+1;
        int x=0;
        while(idx1 <= mid && idx2 <= ei){
            if (arr[idx1]<= arr[idx2]) {
                merge[x] = arr[idx1];
                x++;
                idx1++;
            }else{
                merge[x] = arr[idx2];
                x++;
                idx2++;
            }

        }

        while (idx1 <= mid) { 
             merge[x] = arr[idx1];
                x++;
                idx1++;
        }
        while (idx2 <= ei) { 
            merge[x] = arr[idx2];
                x++;
                idx2++;
        }
        
        for(int i=0, j=si; i<merge.length; i++, j++){
            arr[j] = merge[i]; 
        }
    }


    public static void div(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;
        div(arr, si, mid);
        div(arr, mid+1, ei);
        con(arr, si, mid, ei);
    }



    public static void main(String [] args){
        int arr[] = {0, 1, 2, 0, 1, 2, 0, 2, 1};
        int n = arr.length;

        div(arr, 0, n-1);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
