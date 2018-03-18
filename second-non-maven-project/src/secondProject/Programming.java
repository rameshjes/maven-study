package secondProject;

import nonMavenProject.Application;

/*
 * Used Jar file from first-non-maven-project in this project
 * 
 */
public class Programming {

	public static void main(String[] args) {
		Application a = new Application();
		System.out.println(a.add(4, 6));
	}
}
