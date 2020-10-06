class Solution 
{
    public String defangIPaddr(String address)
    {
        String ipadr=address.replace(".","[.]");
        return ipadr;
    }
}
