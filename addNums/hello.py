import time

iterations = 1000
start_time = time.time_ns()
for _ in range(iterations):
    result = 0
    for i in range(1000000):
        result += i

end_time = time.time_ns()

execution_time = (end_time - start_time) / iterations
print(f"Average time on Python: {execution_time:.0f} ns")
