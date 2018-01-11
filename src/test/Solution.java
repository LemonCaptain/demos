package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {

	
	
	//求范围内1的个数
//	public int NumberOf1Between1AndN_Solution(int n) {
//		int num=0;
//		for(long m = 1;m<=n;m*=10)
//		{
//			int a=(int) (n/m);
//			int b=(int) (n%m);
//			
//			if(a%10==0)
//				num+=a/10*m;
//			else if(a%10==1)
//				num+=(a/10*m)+(b+1);
//			else
//				num+=(a/10+1)*m;
//		}
//		return num;
//    }
	
	
	
	
	//最大连续字段和
//	public static int FindGreatestSumOfSubArray(int[] array) {
//		int i=0,temp=array[0];   
//        int max=array[0];
//		for(i=1;i<array.length;i++)
//		{
//			if(temp<0)
//				temp=array[i];
//			else
//				temp+=array[i];
//			if(temp>max)
//				max=temp;
//		}
//		return max;
//    }
	
	
	//查找顺序统计量
//	public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
//        ArrayList<Integer> result=new ArrayList<Integer>();
//		quicksort(input, 0,input.length-1);
//		if(k>input.length)
//			return result;
//		for(int i=0;i<k;i++)
//			result.add(input[i]);
//		return result;
//        
//    }
//	
//	public static void quicksort(int[] input,int left,int right) {
//		if(left<right) {
//			int key=input[left];
//			int low =left;
//			int high= right;
//			while(low<high) {
//				while(low<high&&input[high]>=key)
//					high--;
//				input[low]=input[high];
//				while(low<high&&input[low]<=key)
//					low++;
//				input[high]=input[low];
//			}
//			input[low]=key;
//			quicksort(input,left,low-1);
//			quicksort(input, low+1, right);
//		}
//	}
//	
	
	
	//查找众数
//	public static int MoreThanHalfNum_Solution(int [] array) {
//        int tmp=0,i=0,count=0;
//        int sum=0;
//        for(i=0;i<array.length;i++)
//        {
//            if(count==0) {
//                tmp=array[i];
//                count++;
//            }
//            else{
//                if(tmp==array[i])
//                    count++;
//                else
//                    count--;
//            }
//        }
//        for(i=0;i<array.length;i++)
//        {
//            if(array[i]==tmp)
//                sum++;
//        }
//        if(sum>array.length/2)
//            return tmp;
//        else
//            return 0;
//    }
	
	
	
	
	//求字符串的组合形式
	
//	public static ArrayList<String> Permutation(String str) {
//		ArrayList<String> result=new ArrayList<String>();
//		if(str!=null&&str.length()>0) {
//			PermutationHelper(str.toCharArray(), 0, result);
//			Collections.sort(result);
//		}	
//		return result;
//	}
//	
//	public static void PermutationHelper(char[] str, int i, ArrayList result) 
//	{
//		if(i==str.length-1)
//		{
//			String tmp=String.valueOf(str);
//			if(!result.contains(tmp))
//				result.add(tmp);
//		}
//		else
//		{
//			for(int j=i;j<str.length;j++)
//			{
//				swap(str,i,j);
//				PermutationHelper(str, i+1, result);
//				swap(str,j,i);
//			}
//		}
//	}
//	
//	public static char[] swap(char[] a,int b,int c)
//	{
//		char temp=' ';
//		temp=a[b];
//		a[b]=a[c];
//		a[c]=temp;
//		return a;
//	}
//	
	
	
	
	//将二叉树转换为双向链表
	
//	public TreeNode Convert(TreeNode pRootOfTree) {
//        if(pRootOfTree==null)
//        	return null;
//        if(pRootOfTree.left==null&&pRootOfTree.right==null)
//        	return pRootOfTree;
//        TreeNode left=Convert(pRootOfTree.left);
//        TreeNode p=left;
//        while(p!=null&&p.right!=null)
//        	p=p.right;
//        if(left!=null)
//        {
//        	p.right=pRootOfTree;
//        	pRootOfTree.left=p;
//        }
//        TreeNode right=Convert(pRootOfTree.right);
//        if(right!=null)
//        {
//        	pRootOfTree.right=right;
//        	right.left=pRootOfTree;
//        }
//        return left==null?pRootOfTree:left;
//        
//        
//        	
//    }
//	
	
	
	
	
	
	//复制复杂的链表
	
//	public RandomListNode Clone(RandomListNode pHead)
//    {
//		if(pHead==null)
//			return null;
//		RandomListNode nowNode=pHead;
//		while(nowNode!=null)
//		{
//			RandomListNode node=new RandomListNode(nowNode.label);
//			node.next=nowNode.next;
//			nowNode.next=node;
//			nowNode=node.next;
//		}
//		nowNode=pHead;
//		while(nowNode!=null)
//		{
//			if(nowNode.random!=null)
//				nowNode.next.random=nowNode.random.next;
//			nowNode=nowNode.next.next;
//		}
//		RandomListNode newhead=pHead.next;
//		RandomListNode cut=newhead;
//		nowNode=pHead;
//		while(nowNode!=null)
//		{
//			nowNode.next=nowNode.next.next;
//			if(cut.next!=null)
//				cut.next=cut.next.next;
//			cut=cut.next;
//			nowNode=nowNode.next;
//		}
//		return newhead;
//		
//	
//    }
	
	
	
	//查找路径和为某个数的全部路径

//	private ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
//    private ArrayList<Integer> resultpart=new ArrayList<Integer>();
//	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
//        if(root==null)
//        	return result;
//        resultpart.add(root.val);
//        target=target-root.val;
//        if(target==0&&root.left==null&&root.right==null)
//        	result.add(new ArrayList<Integer>(resultpart));
//        FindPath(root.left, target);
//        FindPath(root.right, target);
//        resultpart.remove(resultpart.size()-1);   //避免对后面list产生影响
//        return result;
//        
//    }
//	

	
	
	
	
//	public static boolean VerifySquenceOfBST(int [] sequence) {
//        if(sequence.length==0)
//        	return false;
//        else
//        	return verify(sequence);
//		
//    }
//	
//	public static boolean verify(int [] sequence) {
//		if(sequence.length<=1)
//        	return true;
//		int temp=sequence[sequence.length-1];
//        int i=0;
//        int size=0;
//        for(i=0;i<sequence.length;i++)
//        {
//        	if(sequence[i]<temp)
//        		size++;
//        	else
//        		break;
//        }
//        int[] left = new int[size];
//        int[] right=new int[sequence.length-size-1];
//        for(i=0;i<sequence.length;i++) {
//        	if(sequence[i]<temp)
//        	{
//        		left[i]=sequence[i];
//        	}
//        	else
//        		break;
//        }
//        for(int j=0;i<sequence.length-1;i++,j++) {
//        	right[j]=sequence[i];
//        	if(sequence[i]<temp)
//        		return false;
//        }
////        return true;
//        return verify(left)&&verify(right); 
//	}
	
//	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
//        Queue<TreeNode> queue=new LinkedList<TreeNode>();
//        ArrayList<Integer> result=new ArrayList<Integer>();
//        queue.offer(root);
//        while(!queue.isEmpty()) {
//        	TreeNode temp=queue.poll();
//        	if(temp!=null)
//        	{
//        		result.add(temp.val);
//        		queue.add(temp.left);
//        		queue.add(temp.right);
//        	}
//        }
//        return result;
//    }
	
	
	
//	public static boolean IsPopOrder(int [] pushA,int [] popA) {
//		Stack <Integer> temp=new Stack<Integer>();
//		if(pushA.length==0)
//			return false;
//		int sign=0;
//		for(int i=0;i<pushA.length;i++)
//		{
//			temp.push(pushA[i]);
//			while(!temp.empty()&&temp.peek()==popA[sign]) {
//				temp.pop();
//				sign++;
//			}
//			
//		}
//		return temp.empty();
//		
//	}
//	
	
	
	
	
	
	
//	  ArrayList<String > arr = new ArrayList<String >();
//	
//	public ArrayList<String> Permutation(String str) {
//	       if(str.length()==1) {
//	           arr.add(str);
//	           return arr;
//	       }
//	       else {
//	    	   char [] chararray=str.toCharArray();
//	    	   
//	    	   
//	    	   return arr;
//	       }
//	}
//	
//	public ArrayList<String> process(char[] chararray,char char0){
//		ArrayList<String > arr1 = new ArrayList<String >();
//		for(int i=0;i<=chararray.length;i++) {
//			arr1.add(String.valueOf(char0)+chararray.toString());
//			
//		}
//		return arr1;
//	}
	
	public static void main(String[] args) {

	}

}


class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}


