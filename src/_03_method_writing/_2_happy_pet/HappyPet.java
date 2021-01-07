package _03_method_writing._2_happy_pet;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line:
	static int happinessLevel = 0;
	// this will be used to store the happiness of your pet

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String Pet = JOptionPane.showInputDialog("What pet do you want? (Dog, Cat or Hamster)");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		while (happinessLevel < 10) {

			int task = JOptionPane.showOptionDialog(null, "Do you want to...", "", 0, JOptionPane.INFORMATION_MESSAGE,
					null, new String[] { "Walk your " + Pet, "Feed your " + Pet, "Give your " + Pet + " water",
							"Let your " + Pet + " sleep" },
					null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task == 0) {
				walk(Pet);
			}
			if (task == 1) {
				feed(Pet);
			}
			if (task == 2) {
				water(Pet);
			}
			if (task == 3) {
				sleep(Pet);
			}
		}
		// 6 If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.
JOptionPane.showMessageDialog(null, "Your pet is now happy!");
	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	static void walk(String Pet) {
		if (Pet.equalsIgnoreCase("dog")) {
			happinessLevel += 2;
		} else if (Pet.equalsIgnoreCase("cat")) {
			happinessLevel += 1;
		} else if (Pet.equalsIgnoreCase("hamster")) {
			happinessLevel -= 1;
		}

		JOptionPane.showMessageDialog(null, "Your pet's happiness level is " + happinessLevel);
	}

	static void feed(String Pet) {
		if (Pet.equalsIgnoreCase("dog")) {
			happinessLevel += 1;
		} else if (Pet.equalsIgnoreCase("cat")) {
			happinessLevel += 2;
		} else if (Pet.equalsIgnoreCase("hamster")) {
			happinessLevel += 1;
		}

		JOptionPane.showMessageDialog(null, "Your pet's happiness level is " + happinessLevel);
	}

	static void water(String Pet) {
		if (Pet.equalsIgnoreCase("dog")) {
			happinessLevel += 1;
		} else if (Pet.equalsIgnoreCase("cat")) {
			happinessLevel += 1;
		} else if (Pet.equalsIgnoreCase("hamster")) {
			happinessLevel += 2;
		}

		JOptionPane.showMessageDialog(null, "Your pet's happiness level is " + happinessLevel);
	}

	static void sleep(String Pet) {
		if (Pet.equalsIgnoreCase("dog")) {
			happinessLevel += 1;
		} else if (Pet.equalsIgnoreCase("cat")) {
			happinessLevel += 3;
		} else if (Pet.equalsIgnoreCase("hamster")) {
			happinessLevel += 2;
		}

		JOptionPane.showMessageDialog(null, "Your pet's happiness level is " + happinessLevel);
	}
}
