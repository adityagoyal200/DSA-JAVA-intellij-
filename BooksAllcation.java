public class BooksAllcation {
    public static void main(String[] args) {
        int[] books = {25,46,28,49,24};
        int students = 4;
        int len = books.length;
        System.out.println(findPages(books,len,students));
    }

    //minimum pages that could be assigned to a student here would be 49
    //so low = max of books array
    //high would if there is only one student thus we have give everthing to that student so summ of student arr would be high

    public static int countStudents(int[] books, int pages){
        int len = books.length;
        int stud = 1;
        int currPages = 0;

        for (int book : books) {
            if (currPages + book <= pages) {
                currPages += book;
            } else {
                stud++;
                currPages = book;
            }
        }

        return stud;
    }

    public static int findPages(int[] books, int booksLen, int k){
        if(k > booksLen){
            return -2;
        }
        int low = Integer.MAX_VALUE;
        int high = books[0];

        for(int num: books){
            low = Math.min(num, low);
            high += num;
        }
        while(low <= high){
            int mid = (low+high)/2;
            int stud = countStudents(books,mid);
            if(stud > k ){
                low = mid+1;
            } else {
                high = mid -1;
            }
        }

        return low;
    }

}
