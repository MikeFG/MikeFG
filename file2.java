private  static<T> List[] partition(List<T> list, int n)
	{
	    // Calculate the total number of partitions of size `n` each
	    int m = list.size() / n;
	    if (list.size() % n != 0) {
	        m++;
	    }
	 
	    // partition the list into sublists of size `n` each
	    List<List<T>> itr = ListUtils.partition(list, n);
	 
	    // create `m` empty lists and initialize them with sublists
	    List<T>[] partition = new ArrayList[m];
	    for (int i = 0; i < m; i++) {
	        partition[i] = new ArrayList(itr.get(i));
	    }
	 
	    // return the lists
	    return partition;
	}
