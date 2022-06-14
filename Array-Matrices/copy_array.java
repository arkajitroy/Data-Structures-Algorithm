
class copy_array {

    public static void main(String[] args) {

        char set[] = { 'A', 'B', 'A', 'M', 'D', 'S', 'A', 'R', 'Y', 'Z', 'E', 'N', 'F', 'H' };

        int first = 3;
        int sec = 5;

        char copy_set[] = new char[first];
        char copy_set_2[] = new char[sec];

        System.arraycopy(set, 2, copy_set, 0, 3);
        System.arraycopy(set, 7, copy_set_2, 0, 5);

        System.out.println(String.valueOf(copy_set));
        System.out.println(String.valueOf(copy_set_2));
    }
}