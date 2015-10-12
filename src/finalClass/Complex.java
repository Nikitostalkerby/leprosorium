package finalClass;

public final class Complex {
	private final float realPart;
	private final float imaginaryPart;

	private Complex(float re, float im) {
		this.realPart = re;
		this.imaginaryPart = im;
	}

	public static Complex valueOf(float realPart, float imaginaryPart) {
		return new Complex(realPart, imaginaryPart);
	}

	public float getRealPart() {
		return this.realPart;
	}

	public float getImaginaryPart() {
		return this.imaginaryPart;
	}

	public Complex add(Complex c) {
		return new Complex(realPart + c.realPart, imaginaryPart + c.imaginaryPart);
	}

	public Complex subtract(Complex c) {
		return new Complex(realPart - c.realPart, imaginaryPart - c.imaginaryPart);
	}

	public Complex divide(Complex c) {
		float tmp = c.realPart * c.realPart + c.imaginaryPart + c.imaginaryPart;
		return new Complex((realPart * c.realPart + imaginaryPart * c.imaginaryPart) / tmp,
				(imaginaryPart * c.realPart - realPart * c.imaginaryPart) / tmp);
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;

		if (!(o instanceof Complex))
			return false;

		Complex c = (Complex) o;
		return (Float.floatToIntBits(realPart) == Float.floatToIntBits(c.realPart))
				&& (Float.floatToIntBits(imaginaryPart) == Float.floatToIntBits(c.imaginaryPart));
	}

	public int hashCode() {
		int result = 17 + Float.floatToIntBits(realPart);
		result = 37 * result + Float.floatToIntBits(imaginaryPart);
		return result;
	}

	public String toString() {
		return "(" + this.realPart + " + " + this.imaginaryPart + "i)";
	}
}