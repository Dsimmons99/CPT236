/*
 *  Beginning comment block describing the author, when the program
 *  was created, for what reason, etc.
 *
 *  The comment block is followed by any package or import
 *  statements, which are optional.
 */
import java.util.*;

public class demo {
	/*
	 *  Variables containing values that don't change during the
	 *  execution of the program -- called "constants" -- go here.
	 *  You need to explain what the variable will be used for in
	 *  comments if it's not clear.
	 */
	static final int	FEET_IN_A_MILE	= 5280;

	static final Scanner	console = new Scanner(System.in);

	public static void main(String[] args)
	{
		/*
		 *  Variable declaration go here.  Again, if it's not clear
		 *  from the name, you need to explain what the variable
		 *  will be used for in a comment.
		 *
		 *  A double is a variable which holds floating point
		 *  values -- values with a fraction.
		 *  An int is a variable which holds integer values --
		 *  whole numbers that can never have a fractional part.
		 */
		double	givenMPH;

		/*
		 *  Executable statements follow the variable declarations.
		 *
		 *  Blocks of code may be preceded by a comment block that
		 *  describes what the code is intended to do.  For example:
		 *
		 *  This block of code asks the user to provide a value for
		 *  givenMPH for use in later calculations.
		 */
		System.out.print("Enter miles per hour: ");
		givenMPH = console.nextDouble();

		/*
		 *  This block of code demonstrates multiple ways to code
		 *  long statements.  Which do you think is easier to read?
		 */
		System.out.println("Here's a statement with a long string to output " + givenMPH + " to the screen.");
		System.out.println("Here's a statement with a long string" +
		" to output " + givenMPH + " to the screen.");
		System.out.println("Here's a statement with a long string" +
						   " to output " + givenMPH +
						   " to the screen.");
	}
}