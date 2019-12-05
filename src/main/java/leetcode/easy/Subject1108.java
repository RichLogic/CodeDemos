package leetcode.easy;

public class Subject1108 {
    public String defangIPaddr(String address) {
        String[] addrs = address.split("\\.");

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<addrs.length; i++) {
            sb.append(addrs[i]);
            if (i != addrs.length - 1)
                sb.append("[.]");
        }

        return sb.toString();
    }
}
