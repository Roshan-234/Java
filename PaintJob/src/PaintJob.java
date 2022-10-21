public class PaintJob {
    public static void main(String[] args) {

        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4,2.1,1.5));
        System.out.println(getBucketCount(3.26,0.75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket) {
        int requiredBucket = 0;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0) {
            return -1;
        } else {
            double area = width * height;
            double areaToPaint =(area - extraBucket * areaPerBucket);
            requiredBucket = (int) Math.ceil(areaToPaint / areaPerBucket);
            return requiredBucket;
        }

    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        int requiredBucket = 0;
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }else{
            double area = width * height;
            requiredBucket = (int) Math.ceil(area / areaPerBucket);
            return requiredBucket;
        }

    }
    public static int getBucketCount(double area, double areaPerBucket){
        int requiredBucket = 0;
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }else {
            requiredBucket = (int) Math.ceil(area / areaPerBucket);
            return requiredBucket;
        }

    }

}
