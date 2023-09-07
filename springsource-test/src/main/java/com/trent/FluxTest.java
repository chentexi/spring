package com.trent;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author: Trent
 * @Date: 2022/8/29 14:11
 * @program: spring
 * @Description:
 */
public class FluxTest{
	public static void main(String[] args){
		Flux.just(1,2,3,4,5,6).subscribe(System.out ::println);
		Mono.just(1).subscribe(System.out::print);
		
		Integer[] d ={1,2,3,4,5,6,7,8};
		Flux.fromArray(d);
		
		List<Integer> f= Arrays.asList(1,2,3,4,5,6,7,9);
		Flux.fromIterable(f);
		
		Stream<Integer> stream=f.stream();
		Flux.fromStream(stream);
	}
}