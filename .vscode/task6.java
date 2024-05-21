public static List<Integer> roundUpToNearestMultipleOf100(int[] intList) {
        List<Integer> roundedList = new ArrayList<>();

        for (int num : intList) {
            if (num % 100 == 0) {
                roundedList.add(num); // Number is already a multiple of 100
            } else {
                int roundedNum = ((num / 100) + 1) * 100; // Round up to the next-highest multiple of 100
                roundedList.add(roundedNum);
            }
        }

        return roundedList;
    }
