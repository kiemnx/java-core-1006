package lession5;

public class Activity51 {

    private float width;
    private float height;

    public Activity51(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getChuVi() {
        return (width + height) * 2;
    }

    public float getDienTich() {
        return width * height;
    }

    public boolean check() {
        if (width == height) {
            return true;
        } else
            return false;
    }

    @Override
    public String toString() {
        return "Activity51{" +
                "width=" + width +
                '}';
    }
}
