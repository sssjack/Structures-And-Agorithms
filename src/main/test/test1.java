import java.util.*;

public class test1 {
    /**
     * ����String��==��eequals�ıȽϲ���
     *
     * @param args
     */
    public static void main(String[] args) {
        Random rand = new Random();
        HashMap<Integer, Integer> record = new HashMap<>();

        int[] ints = new int[600];//�½�һ��0-600�ļ���
        for(int i=0;i<ints.length;i++){
            ints[i] = i+1;
        }
        for(int i=0;i<1000;i++){
            int j = rand.nextInt(600) + 1;
            if(j%2==0) j = j+1;
            System.out.println("��ʱints�ĳ�����"+ints.length+",j���������"+j);
            if(j<= ints.length) {
                System.out.println("��"+(i+1)+"��ѭ��ɾ��������"+ints[j-1]);
                Integer integer = record.get(ints[j-1]);
                if(integer==null){
                    record.put(ints[j-1],i );
                }
                ints = delete(ints, j - 1);//���㵽�����Ƴ�
            }
//            for(int k=0;k<ints.length;k++){//��¼ɱ������Աʱ��Ĵ���

          }
//        }
        int key = 0;
        int value = 0;

        for (Integer keys : record.keySet()) {
            if(record.get(keys)>value){
                value = record.get(keys);
                key = keys;
            }
        }

        System.out.println(record);
        System.out.println(Arrays.toString(ints));
        System.out.println("key:" + key + "---" + "value:" + value);



//        int i = rand.nextInt(2) + 2;
//        System.out.println(i);



    }
    public static int[] delete(int []n,int index) {
        int j=0;
        if(index<0||index>=n.length) {
            return n;
        }
        int []b=new int[n.length-1];
        for(int i=0;i<n.length;i++) {
            if(i==index)continue;
            b[j++]=n[i];
        }
        return b;
    }


}