  class Traping_Rainwater{
    public static int trappedRainwater(int height[]){
        int n=height.length;
        // calculate left max boundary-array
    int leftMax[]=new int [n];
    leftMax[0]=height[0];
    for(int i=1;i<n;i++){
        leftMax[i]=Math.max(height[i],leftMax[i-1]);
    }

        // calculate right max boundray-array
     int rightMax[]=new int [n];
     rightMax[n-1]=height[n-1];
     for(int i=n-2;i>=0;i--){
        rightMax[i]=Math.max(height[i],rightMax[i+1]);
     }

    // loop
    int trappedwater=0;
    for(int i=0;i<n;i++){
        // waterlevel=min(leftmax bound,rightmax bound)
       int  waterlevel=Math.min(leftMax[i],rightMax[i]);
        //trapped water=waterlevel-hight[i] 
    trappedwater += waterlevel-height[i];
    }
    return trappedwater;
    
    }

    public static void main(String[] args) {
        int height[]={4,2,0,3,2,5};
    System.out.println("trapped water amount is "+trappedRainwater(height));
    }
  }