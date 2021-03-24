from flask import Flask
import py_eureka_client.eureka_client as eureka_client

ec = eureka_client.init(
  eureka_server="http://eureka:8761/eureka",
  app_name="fibonacci",
  instance_port=8888
)

app = Flask(__name__)

@app.route("/fibonacci")
def main():
    return {
      'message': 'Hello from Fibonacci'
    }

def calculate(number):
  if number <= 2:
    return 1
  return calculate(number - 1) + calculate(number - 2)

@app.route("/fibonacci/<number>")
def calculateFibonacci(number):
  n = int(number)
  return {
    'result': calculate(n)
  }
