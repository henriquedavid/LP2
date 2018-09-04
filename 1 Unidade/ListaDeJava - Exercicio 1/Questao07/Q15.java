public class Q15
{
public int numberOfSeats;
private String model;
private int engineCode;
public Q15(String model)
{
model = model;
}
public int getSeats()
{
return numberOfSeats;
}
private String getModel()
{
return model;
}
public void setEngineCode(int code)
{
int n = code * 2;
if(code >= 100) {
engineCode = n;
}
else {
engineCode = code;
}
}
}
