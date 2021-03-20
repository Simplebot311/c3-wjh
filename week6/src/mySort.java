/**
 * @author yufeng1900
 * @create 2021-03-20 15:56
 */
public class mySort {

    public static void main(String[] args) {
        int[] nums = {16,7,3,20,8,17};
        //测试区域
        //bubbleSort(nums);
        //insertSort(nums);
        //quickSort(nums);
        //MergeSort(nums,0,nums.length-1);
        //headSort(nums);
        System.out.print("最终排序结果：");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    //冒泡排序
    public static void bubbleSort(int[]data) {
        int temp;
        for(int i = data.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {

                if(data[j] > data[j + 1]) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
            System.out.print("第" + (data.length - i) +"次排序结果为： ");
            for(int k = 0; k < data.length; k++) {
                System.out.print(data[k] + " ");
            }
            System.out.print("\n");
        }
    }

    //插入排序
    public static int[] insertSort(int[] ins){

        for(int i=1; i<ins.length; i++){
            for(int j=i; j>0; j--){
                if(ins[j]<ins[j-1]){
                    int temp = ins[j-1];
                    ins[j-1] = ins[j];
                    ins[j] = temp;
                }
            }
        }
        return ins;
    }

    //快速排序
    public static void quickSort(int[] a,int low,int height) {
        int i,j,d;
        if(low>=height){
            return;
        }
        i=low;
        j=height;
        d=a[i];
        while(i<j){
            while(i<j&&a[j]>=d){
                j--;
            }
            if(a[j]<a[i]){
                a[i++]=a[j];
                while(i<j&&a[i]<=d){
                    i++;
                }
                if(a[i]>d){
                    a[j--]=a[i];
                }
            }
        }
        a[i]=d;
        quickSort(a, low, i-1);
        quickSort(a, i+1, height);
    }
    public static void quickSort(int a[]){
        quickSort(a, 0, a.length - 1);
    }

    //合并排序
    public static void MergeSort(int[] array,int head,int tail){
        // 判断数组的头部索引是否小于尾部索引
        if(head < tail){
            int middle = (head+tail)/2;
            MergeSort(array,head,middle);
            MergeSort(array,middle+1,tail);
            Merge(array,head,middle,tail);
        }
    }

    public static void Merge(int[] array, int head, int middle, int tail) {
        // TODO Auto-generated method stub
        int[] temp = new int[tail - head + 1];
        int a = head;
        int b = middle + 1;
        int i = 0;
        // 对于两个数组中的数进行比较，将较小的值存放在临时数组中
        while(a <= middle && b <=tail){

            if(array[a] < array[b]){
                temp[i++] = array[a++];
            }
            else{
                temp[i++] = array[b++];
            }
        }

        // 将未参与比较的数组中的数添加到临时数组中
        while(a <= middle){
            temp[i++] = array[a++];
        }

        while(b <= tail){
            temp[i++] = array[b++];
        }

        // 将排好序的数组放回到array数组中
        System.arraycopy(temp,0,array,head,tail - head + 1);
    }
    //堆排序
    public static void headSort(int[] list) {
        //构造初始堆,从第一个非叶子节点开始调整,左右孩子节点中较大的交换到父节点中
        for (int i = (list.length) / 2 - 1; i >= 0; i--) {
            headAdjust(list, list.length, i);
        }
        //排序，将最大的节点放在堆尾，然后从根节点重新调整
        for (int i = list.length - 1; i >= 1; i--) {
            int temp = list[0];
            list[0] = list[i];
            list[i] = temp;
            headAdjust(list, i, 0);
        }
    }

    private static void headAdjust(int[] list, int len, int i) {
        int k = i, temp = list[i], index = 2 * k + 1;
        while (index < len) {
            if (index + 1 < len) {
                if (list[index] < list[index + 1]) {
                    index = index + 1;
                }
            }
            if (list[index] > temp) {
                list[k] = list[index];
                k = index;
                index = 2 * k + 1;
            } else {
                break;
            }
        }
        list[k] = temp;
    }

}
