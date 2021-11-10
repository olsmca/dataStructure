package dataStructure;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortAlgorithm {

    @Test
    public void sortLambda(){

        List<Integer> numLs =  Arrays.asList(5,3,7,2,8,1,9,2);
        System.out.println(numLs);

        numLs.sort(Comparator.naturalOrder());
        System.out.println(numLs);
    }

    @Test
    public void sortInsertion(){
        List<Integer> numLs =  Arrays.asList(5,3,7,2,8,1,9,2);

        System.out.println(numLs);

        for (int i = 1 ; i < numLs.size(); i++){
            int pos = i;

            while (pos > 0 && numLs.get(pos)<numLs.get(pos-1)){
                int tmp = numLs.get(pos-1);
                numLs.set(pos-1,numLs.get(pos));
                numLs.set(pos,tmp);
                pos--;
            }
        }

        System.out.println(numLs);
        assertTrue("List is full ",!numLs.isEmpty());
    }

    @Test
    public void sortInsertionVer2(){
        List<Integer> numLs =  Arrays.asList(5,3,7,2,8,1,9,0);

        System.out.println(numLs);

        for (int i = 1 ; i < numLs.size(); i++){
            int pos = i;
            int value = numLs.get(i);

            while (pos > 0 && value < numLs.get(pos-1)){

                numLs.set(pos,numLs.get(pos-1));
                pos--;
            }
            numLs.set(pos,value);
        }
        System.out.println(numLs);

        assertTrue("List is full ",!numLs.isEmpty());
    }

    @Test
    public void quickSortTest(){
        List<Integer> numLs =  Arrays.asList(5,3,7,2,8,1,9,0);

        System.out.println(numLs);

        quicksort(numLs, 0, numLs.size()-1);
        System.out.println(numLs);
    }

    public void quicksort(List<Integer> numls, int firt, int last){

        int center = (firt+last)/2;
        int pivote = numls.get(center);
        int i=firt;
        int j=last;
        do {
            while (numls.get(i)<= pivote && i<j) i++;
            while (numls.get(j)> pivote) j--;
            if(i<j){
                int aux = numls.get(i);
                numls.set(i,numls.get(j));
                numls.set(j,aux);
            }
        }while (i<j);
        if(firt<j-1) quicksort(numls,firt,j-1);
        if (j+1<last) quicksort(numls,j+1,last);
    }

    @Test
    public void binarySearch(){

        List<Integer> numLs = Arrays.asList(17,4,5,23,8,13,2,19,6,25,26,3);

        numLs.sort(Comparator.naturalOrder());
        System.out.println("--- Binary Search --- ");
        System.out.println("Vector: "+numLs);

        int search = 17;

        int i = 0;
        int j = numLs.size()-1;
        int pivote;

        do{
            pivote = (i+j)/2;
            if (numLs.get(pivote)<=search) i=pivote+1;
            if (numLs.get(pivote)>=search) j=pivote-1;
        }while (i<=j);

        System.out.println("the element "+ numLs.get(pivote) + " does in vector in position: "+  pivote);
        System.out.println("--- --- --- ");
    }

}
