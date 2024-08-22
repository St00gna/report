package main

import (
	"fmt"
	"time"
)

func main() {
	iterations := 1000
	start := time.Now()

	for j := 0; j < iterations; j++ {
		result := 0
		for i := 0; i < 1000000; i++ {
			result += i
		}
	}

	elapsed := time.Since(start)
	averageTime := elapsed.Nanoseconds() / int64(iterations)
	fmt.Printf("Average time on Go: %d ns\n", averageTime)
}
