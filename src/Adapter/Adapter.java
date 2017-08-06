package Adapter;

/**
 * Created by NiQiu on 2017/8/6.
 */
public class Adapter {
}
interface ScoreOperation{
    public int[] sort(int array[]);
    public int search(int array[],int key);
}

class QuckSort{
    public int[] quickSort(int array[]){
        return  array;
    }
}
class BinarySearch{
    public int binarySearch(int array[], int key){
        return 3;
    }
}

class OperationAdapter implements ScoreOperation{
    private QuckSort sortObj;
    private BinarySearch searchObj;
    public OperationAdapter(){
        sortObj=new QuckSort();
        searchObj=new BinarySearch();
    }
    public int[] sort(int array[]) {
        return sortObj.quickSort(array);
    }
    public int search(int array[], int key){
        return searchObj.binarySearch(array,key);
    }
}
