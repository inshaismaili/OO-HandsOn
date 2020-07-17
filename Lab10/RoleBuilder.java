public class RoleBuilder {
	private static String roles[] = { "UNDEFINED", "DEVELOPER", "TEST_ENGINEER", "SR_DEVELOPER", "DESIGNER" };

	public static String getRoleDescription(int roleId) {
		if(roleId<1 || roleId>4)
			roleId=0;
		return roles[roleId];
	// Complete the logic

	
	}
}
