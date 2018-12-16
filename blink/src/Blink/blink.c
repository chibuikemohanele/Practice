#include <Arduino.h>

int led = 13;

void setup() 
{
  //put your setup code here, to run once:
  pinMode(led, OUTPUT);
  
}

void loop() 
{
  digitalWrite(led, HIGH);
  delay(100);
  digitalWrite(led, LOW);
  delay(100);
}