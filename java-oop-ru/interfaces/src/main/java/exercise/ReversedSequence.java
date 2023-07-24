package exercise;

// BEGIN
class ReversedSequence implements CharSequence{
    String string;

    ReversedSequence(String s){
        string = s;
    }

    @Override
    public int length() {
        return string.length();
    }

    @Override
    public char charAt(int index) {
        return string.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    public String toString(){
        String newStr = "";
        for (int i = 0; i < string.length(); i++){
            newStr = string.charAt(i) + newStr;
        }
        return newStr;
    }
}
// END
