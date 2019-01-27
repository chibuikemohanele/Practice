#include <Arduino.h>

int blue = 2;
int green = 3;
int red = 4;
int built = 13;
int count = 0;

void setup() {
  // put your setup code here, to run once:
  pinMode(built, OUTPUT);
  pinMode(blue, OUTPUT);
  pinMode(green, OUTPUT);
  pinMode(red, OUTPUT);
}

void setColor(int blueColor, int redColor, int greenColor)
{
  analogWrite(red, redColor);
  analogWrite(blue, blueColor);
  analogWrite(green, greenColor);
}

void loop()
{
  // put your main code here, to run repeatedly:
  if(count < 5)
  {
    //turns on red part of led
    digitalWrite(built, HIGH);
    digitalWrite(red, HIGH);
    delay(100);
    digitalWrite(built, LOW);
    digitalWrite(red, LOW);
    delay(100);

    //turns on blue part of led
    digitalWrite(built, HIGH);
    digitalWrite(blue, HIGH);
    delay(100);
    digitalWrite(built, LOW);
    digitalWrite(blue, LOW);
    delay(100);

    //turns on green part of led
    digitalWrite(built, HIGH);
    digitalWrite(green, HIGH);
    delay(100);
    digitalWrite(built, LOW);
    digitalWrite(green, LOW);
    delay(100);
  }
  else
  {
    exit(0);
  }

  count++;

}
