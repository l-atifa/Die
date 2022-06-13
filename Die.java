public class Die{

private int value;
private int numSides;
private static int id; //static, like a counter shared between classes
private int dieID;

public Die(int v, int n)
{
  setValue(v);
  setNumSides(n);
  id++;
  setDieID(id);
}

public Die()
{
  this(1,6); //less code
}

public int getValue()
{
  return value;
}
public int getNumSides()
{
  return numSides;
}

public void setValue(int v)
{
  value = v;
}
public void setNumSides(int n)
{
  numSides = n;
}

public void setDieID(int d)
{
  dieID = d;
}

public int roll()
{
  int value = (1+ ((int) (numSides*Math.random())));
  this.setValue(value);
  return value;

}

public String toString()
{
  return "\nDie ID: " + dieID + "\nValue: " + value + "\nNumSides: " + numSides;
}

public boolean equals(Die d)
{
  if(this.getValue() == d.getValue())
  {
    return true;
  }
  else
  {
    return false;
  }
}

}