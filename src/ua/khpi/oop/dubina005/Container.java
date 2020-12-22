package ua.khpi.oop.dubina005;

import java.util.Arrays;

public class Container
{
	int size=0;
	 String[] arr=new String[255];

 	 public String toString() 
	 {
		 if (size ==-1) {
			 System.out.print("\nМасив пустий. Елементів немає. Попернуто null");
			 return null;
		 }
		 String temp=new String();
		 for (int i=0;i<size;i++)
			 temp+=arr[i];
		 return temp;
	 }
	 void add(String string) 
	 {
		 String newArr[] = new String[size + 1];
			for (int i = 0; i < size; i++) 
				newArr[i] = arr[i];
			newArr[size] = string;
			size++;
			arr = newArr;
	 }
	 void clear()
	 {
        while (size!=0)
       	 iterator().remove();
     
    }
	 boolean remove (String string)
	 {
		 
		 if (size == 0) return false;
         for (int i=0;i<size;i++)
          
       if (arr[i].equals(string+" "))
         
       { for (; i < size-1; i++)
           arr[i]=arr[i+1];
              this.arr[--size] = null;
              return true;
       }
         
         return false;
			
	 }
	
	 int size()
	 {
		 return size;
	 }
	 boolean contains(String string)
	 {
		 if (size ==0) return false;
	        for (int i=0;i<size;i++)
	          if (arr[i]==string)    
	             return true;
	      
	        return false;
	 }
	 Object[] toArray() 
	 {
		 return arr;
	 }
	 boolean containsAll(Container container)
	 {
		 if(container.size==size) 
			 if(container.arr==arr)
				 return true;
			 return false;
		
				 
	 }
	 public Iterator<String> iterator() 
	 {
		 return new m_Iterator();
	 }
	 
	 public class m_Iterator implements Iterator<String>
	 {

		    int index = 0;
			public boolean hasNext() {
			if(index<size) 
				return true;
			    return false;
			}
			public String next()
			{
			return arr [index++];	
			
			}
			public void remove()
			{
		         for (int i=index; i < size-1; i++)
		  	    		  arr[i]=arr[i+1];
		  	             arr[--size] = null;
		  	            
		  	      
		    }
		 
	 }
}
