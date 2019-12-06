package objects;

public class IdGenerator {
private static long accountId;
private static long clientId;

public static long getAccountId() {
	return ++accountId;
}
public static long getClientId() {
	return ++clientId;
}
}
