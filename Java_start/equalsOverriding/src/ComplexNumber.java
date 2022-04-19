public final class ComplexNumber {

    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public int hashCode() {

        final int prime = 42;
        int result = 1;

        long num_re = Double.doubleToLongBits(this.getRe());
        result = prime * result + (int) (num_re ^ (num_re >>> 32));

        long num_im = Double.doubleToLongBits(this.getIm());
        result = prime * result + (int) (num_im ^ (num_im >>> 32));

        return result;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        ComplexNumber other = (ComplexNumber) obj;

        if (this.getRe() != other.getRe())
            return false;

        if (this.getIm() != other.getIm())
            return false;

        return true;
    }
}
