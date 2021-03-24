from flask import Flask
import py_eureka_client.eureka_client as eureka_client

ec = eureka_client.init(
  eureka_server="http://eureka:8761/eureka",
  app_name="power",
  instance_port=5000
)

app = Flask(__name__)

@app.route("/power")
def main():
    return {
      'message': 'Hello from Power'
    }

@app.route("/power/<number_1>/<number_2>")
def calculateFibonacci(number_1, number_2):
  n_1 = int(number_1)
  n_2 = int(number_2)
  return {
    'result': pow(n_1, n_2)
  }
