package com.latifbenzzine.challenges;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;



public class MySolution {
	
	static Node head;
	
	class Node{
		
		int data;
		Node next = null;
		public Node(int d){
			this.data = d;
		}
	}
	
	void appenToTail(int d){
		Node node = head;
		Node end = new Node(d);
		while(node.next != null){
			node = node.next;
		}
		node.next = end;
	}
	
	void printlist(Node node){
		while(node  != null){
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	
	private void removeDuplicates(Node node){
		HashSet<Integer> set =  new HashSet<Integer>();
		Node previous = null;
		while(node != null){
			if(set.contains(node.data)){
				previous.next = node.next;
			}else{
				set.add(node.data);
				previous = node;
			}
			    node = node.next;
		}
	}
	
	static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        
       
    }
	
	public static void main(String [] args) throws IOException{
		String thisline = (" ");
		
		FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextInt();
        }
		MySolution solut = new MySolution();
	
		MySolution.head = solut.new Node(input[0]); 
		
		for(int i = 1 ; i < input.length; i++){
			solut.appenToTail((input[i]));
		}
		
		
		System.out.println("the List before removing duplicates");
		solut.printlist(head);
		System.out.println(" ");
		System.out.println("\n" +  "the List after removing duplicates");
		solut.removeDuplicates(head);
		solut.printlist(head);
	}

}

