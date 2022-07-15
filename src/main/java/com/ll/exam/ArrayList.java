package com.ll.exam;

public class ArrayList {
    private int size;
    private int arr[];

    ArrayList(){
        size = 0;
        arr = new int[2];
    }

    public int size(){
        return size;
    }

    public void add(int n){
        if(size+1 > arr.length){
            int newArr[] = new int[arr.length*2];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
        }

        arr[size++] = n;
    }

    public void add(int n, int index){

        if(index < 0 || index > size){
            System.out.println("올바르지 않은 인덱스입니다.");
            return;
        }

        if(size == arr.length){
            int newArr[] = new int[arr.length*2];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
        }

        for(int i = size; i > index; i--){
            arr[i] = arr[i - 1];
        }

        arr[index] = n;
        size++;
    }

    public int get(int index){
        return arr[index];
    }

    public void removeAt(int index){

        if(index < 0 || index > size){
            System.out.println("올바르지 않은 인덱스입니다.");
            return;
        }

        for(int i = index; i < size-1; i++){
            arr[i] = arr[i+1];
        }

        arr[--size] = 0;

    }

    public int getArrayLength(){
        return arr.length;
    }

    public void showAllValues(){
        System.out.println("== 전체 데이터 출력 ==");
        for(int i = 0; i < size; i++){
            System.out.println(i + " : " + arr[i]);
        }
    }

}
