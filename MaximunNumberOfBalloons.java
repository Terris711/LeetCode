class MaximunNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        int balloon[] = new int[5];

        if(text.length() < 6){
            return 0;
        }

        for(char c:text.toCharArray()){
            switch(c){
                case 'b':
                    balloon[0]++;
                    break;
                case 'a':
                    balloon[1]++;
                    break;
                case 'l':
                    balloon[2]++;
                    break;
                case 'o':
                    balloon[3]++;
                    break;
                case 'n':
                    balloon[4]++;
                    break;
            }
        }

        balloon[2] /= 2;
        balloon[3] /= 2;

        if(balloon[2] <= 0 || balloon[3] <= 0){
            return 0;
        }

        int min = balloon[0];

        for (int i = 1; i < 5; i ++){
            if(balloon[i] < min){
                min = balloon[i];
            }
        }

        if (min <= 0){
            return 0;
        }

        return min;
    }
}





