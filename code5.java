//counting with if statements 
class MyClass {
    public static void main(String args[])
    {
      int i,cnt=0,cnt1=0,cnt2=0;  
      float[] weight={ 3.0F, 4.0F,2.0F}; 
      float[] height={ 3.4F, 5.3F,5.0F};  
      for( i=0; i<=1; i++)
      {
        if((weight[i]<4.0) && (height[i]>4.0))
        {
            cnt1++; 
        }
        cnt++; //total persons
      }
      cnt2=cnt-cnt1; 
      System.out.println("Numbers of persons ...."); 
      System.out.println("weight<4 and height>4 = " +cnt1); 
      System.out.println("others = " +cnt2); 
      

        
    }
}
