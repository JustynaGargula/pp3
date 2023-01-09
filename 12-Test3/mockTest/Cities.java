public class Cities {
    private String[] arr;

    public Cities(String[] arr) {
        this.arr = arr;
    }

    public Cities filter(char character){
        int counter = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].charAt(0) == character){
                counter++;
            }
            else{
                arr[i] = "0";
            }
        }

        String[] newArr = new String[counter];
        int j = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("0") == false){
                newArr[j] = arr[i];
                j++;
            }
        }
        Cities city = new Cities(newArr);
        return city;
    }

    public String cities(){
        String text = "";
        for(String city: this.arr){
            text += city;
        }
        return text;
    }
}
