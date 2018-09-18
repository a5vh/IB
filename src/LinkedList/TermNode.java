package LinkedList;

public class TermNode
{
    Node next;
    double coeff;
    int exp;

    public TermNode(double coeff, int exp)
    {
        this.coeff = coeff;
        this.exp = exp;
    }

    public TermNode()
    {}

    public class Term
    {
        public double getCoefficient()
        {
            return coeff;
        }

        public int getExponent()
        {
            return exp;
        }
    }
}

