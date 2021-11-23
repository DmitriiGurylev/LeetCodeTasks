package src;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * Suppose you have n integers labeled 1 through n.
 * A permutation of those n integers perm (1-indexed)
 * is considered a beautiful arrangement if for every i (1 <= i <= n),
 * either of the following is true:
 * perm[i] is divisible by i.
 * i is divisible by perm[i].
 *
 * Given an integer n, return the number of the beautiful arrangements that you can construct.
 *
 * https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3591/
 *
 * */


public class Task3 {

	int count = 0;

	public static int countArrangementVer1(int n) {
		int count = 0;
		Set<Integer> set = new HashSet<>();
		if (n == 1) {
			return ++count;
		}
		if (n >= 2) {
			for (int i1 = 1; i1 < n + 1; i1++) {
				set.clear();
				set.add(i1);
				for (int i2 = 1; i2 < n + 1; i2++) {
					set.clear();
					set.add(i1);
					if (set.contains(i2)) {
						continue;
					} else if (i2 % 2 == 0 || 2 % i2 == 0) {
						set.add(i2);
						if (n == 2)
							count++;
					} else {
						continue;
					}
					if (n >= 3) {
						for (int i3 = 1; i3 < n + 1; i3++) {
							set.clear();
							set.add(i1);
							set.add(i2);
							if (set.contains(i3)) {
								continue;
							}
							else if (i3 % 3 == 0 || 3 % i3 == 0) {
								set.add(i3);
								if (n == 3)
									count++;
							}
							else {
								continue;
							}
							if (n >= 4) {
								for (int i4 = 1; i4 < n + 1; i4++) {
									set.clear();
									set.add(i1);
									set.add(i2);
									set.add(i3);
									if (set.contains(i4)) {
										continue;
									} else if (i4 % 4 == 0 || 4 % i4 == 0) {
										set.add(i4);
										if (n == 4)
											count++;
									} else {
										continue;
									}
									if (n >= 5) {
										for (int i5 = 1; i5 < n + 1; i5++) {
											set.clear();
											set.add(i1);
											set.add(i2);
											set.add(i3);
											set.add(i4);
											if (set.contains(i5)) {
												continue;
											} else if (i5 % 5 == 0 || 5 % i5 == 0) {
												set.add(i5);
												if (n == 5)
													count++;
											} else {
												continue;
											}
											if (n >= 6) {
												for (int i6 = 1; i6 < n + 1; i6++) {
													set.clear();
													set.add(i1);
													set.add(i2);
													set.add(i3);
													set.add(i4);
													set.add(i5);
													if (set.contains(i6)) {
														continue;
													} else if (i6 % 6 == 0 || 6 % i6 == 0) {
														set.add(i6);
														if (n == 6)
															count++;
													} else {
														continue;
													}
													if (n >= 7) {
														for (int i7 = 1; i7 < n + 1; i7++) {
															set.clear();
															set.add(i1);
															set.add(i2);
															set.add(i3);
															set.add(i4);
															set.add(i5);
															set.add(i6);
															if (set.contains(i7)) {
																continue;
															} else if (i7 % 7 == 0 || 7 % i7 == 0) {
																set.add(i7);
																if (n == 7)
																	count++;
															} else {
																continue;
															}
															if (n >= 8) {
																for (int i8 = 1; i8 < n + 1; i8++) {
																	set.clear();
																	set.add(i1);
																	set.add(i2);
																	set.add(i3);
																	set.add(i4);
																	set.add(i5);
																	set.add(i6);
																	set.add(i7);
																	if (set.contains(i8)) {
																		continue;
																	} else if (i8 % 8 == 0 || 8 % i8 == 0) {
																		set.add(i8);
																		if (n == 8)
																			count++;
																	} else {
																		continue;
																	}
																	if (n >= 9) {
																		for (int i9 = 1; i9 < n + 1; i9++) {
																			set.clear();
																			set.add(i1);
																			set.add(i2);
																			set.add(i3);
																			set.add(i4);
																			set.add(i5);
																			set.add(i6);
																			set.add(i7);
																			set.add(i8);
																			if (set.contains(i9)) {
																				continue;
																			} else if (i9 % 9 == 0 || 9 % i9 == 0) {
																				set.add(i9);
																				if (n == 9)
																					count++;
																			} else {
																				continue;
																			}
																			if (n >= 10) {
																				for (int i10 = 1; i10 < n + 1; i10++) {
																					set.clear();
																					set.add(i1);
																					set.add(i2);
																					set.add(i3);
																					set.add(i4);
																					set.add(i5);
																					set.add(i6);
																					set.add(i7);
																					set.add(i8);
																					set.add(i9);
																					if (set.contains(i10)) {
																						continue;
																					} else if (i10 % 10 == 0 || 10 % i10 == 0) {
																						set.add(i10);
																						if (n == 10)
																							count++;
																					} else {
																						continue;
																					}
																					if (n >= 11) {
																						for (int i11 = 1; i11 < n + 1; i11++) {
																							set.clear();
																							set.add(i1);
																							set.add(i2);
																							set.add(i3);
																							set.add(i4);
																							set.add(i5);
																							set.add(i6);
																							set.add(i7);
																							set.add(i8);
																							set.add(i9);
																							set.add(i10);
																							if (set.contains(i11)) {
																								continue;
																							} else if (i11 % 11 == 0 || 11 % i11 == 0) {
																								set.add(i11);
																								if (n == 11)
																									count++;
																							} else {
																								continue;
																							}
																							if (n >= 12) {
																								for (int i12 = 1; i12 < n + 1; i12++) {
																									set.clear();
																									set.add(i1);
																									set.add(i2);
																									set.add(i3);
																									set.add(i4);
																									set.add(i5);
																									set.add(i6);
																									set.add(i7);
																									set.add(i8);
																									set.add(i9);
																									set.add(i10);
																									set.add(i11);
																									if (set.contains(i12)) {
																										continue;
																									} else if (i12 % 12 == 0 || 12 % i12 == 0) {
																										set.add(i12);
																										if (n == 12)
																											count++;
																									} else {
																										continue;
																									}
																									if (n >= 13) {
																										for (int i13 = 1; i13 < n + 1; i13++) {
																											set.clear();																											set.add(i1);
																											set.add(i1);																											set.add(i1);
																											set.add(i2);
																											set.add(i3);
																											set.add(i4);
																											set.add(i5);
																											set.add(i6);
																											set.add(i7);
																											set.add(i8);
																											set.add(i9);
																											set.add(i10);
																											set.add(i11);
																											set.add(i12);
																											if (set.contains(i13)) {
																												continue;
																											} else if (i13 % 13 == 0 || 13 % i13 == 0) {
																												set.add(i13);
																												if (n == 13)
																													count++;
																											} else {
																												continue;
																											}
																											if (n >= 14) {
																												for (int i14 = 1; i14 < n + 1; i14++) {
																													set.clear();																											set.add(i1);
																													set.add(i1);																													set.add(i1);
																													set.add(i2);
																													set.add(i3);
																													set.add(i4);
																													set.add(i5);
																													set.add(i6);
																													set.add(i7);
																													set.add(i8);
																													set.add(i9);
																													set.add(i10);
																													set.add(i11);
																													set.add(i12);
																													set.add(i13);
																													if (set.contains(i14)) {
																														continue;
																													} else if (i14 % 14 == 0 || 14 % i14 == 0) {
																														set.add(i14);
																														if (n == 14)
																															count++;
																													} else {
																														continue;
																													}
																													if (n == 15) {
																														for (int i15 = 1; i15 < n + 1; i15++) {
																															set.clear();
																															set.add(i1);
																															set.add(i2);
																															set.add(i3);
																															set.add(i4);
																															set.add(i5);
																															set.add(i6);
																															set.add(i7);
																															set.add(i8);
																															set.add(i9);
																															set.add(i10);
																															set.add(i11);
																															set.add(i12);
																															set.add(i13);
																															set.add(i14);
																															if (set.contains(i15)) {
																															}
																															else if (i15 % 15 == 0 || 15 % i15 == 0) {
																																set.add(i15);
																																count++;
																															}
																															else {
																																continue;
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return count;
	}

	public int countArrangementVer2(int n) {
		boolean[] used = new boolean[n];

		calculate(n, 1, used);
		return this.count;
	}

	public void calculate(int n, int currentValue, boolean[] used) {
		if (currentValue > n) {
			count++;
		}
		for (int i=0; i< n; i++) {
			if (!used[i] && (currentValue % (i+1) ==0 || (i+1) % currentValue ==0)) {
				used[i]=true;
				calculate(n,currentValue+1,used);
				used[i]=false;
			}
		}
	}

	public static void main(String[] args) {

		Task3 task3 = new Task3();
		System.out.println("n=1: "+ countArrangementVer1(1) + " " + new Task3().countArrangementVer2(1));
		System.out.println("n=2: "+ countArrangementVer1(2) + " " + new Task3().countArrangementVer2(2));
		System.out.println("n=3: "+ countArrangementVer1(3) + " " + new Task3().countArrangementVer2(3));
		System.out.println("n=4: "+ countArrangementVer1(4) + " " + new Task3().countArrangementVer2(4));
		System.out.println("n=5: "+ countArrangementVer1(5) + " " + new Task3().countArrangementVer2(5));
		System.out.println("n=6: "+ countArrangementVer1(6) + " " + new Task3().countArrangementVer2(6));
		System.out.println("n=7: "+ countArrangementVer1(7) + " " + new Task3().countArrangementVer2(7));
		System.out.println("n=8: "+ countArrangementVer1(8) + " " + new Task3().countArrangementVer2(8));
		System.out.println("n=9: "+ countArrangementVer1(9) + " " + new Task3().countArrangementVer2(9));
		System.out.println("n=10: "+ countArrangementVer1(10) + " " + new Task3().countArrangementVer2(10));
		System.out.println("n=11: "+ countArrangementVer1(11) + " " + new Task3().countArrangementVer2(11));
		System.out.println("n=12: "+ countArrangementVer1(12) + " " + new Task3().countArrangementVer2(12));
		System.out.println("n=12: "+ countArrangementVer1(12) + " " + new Task3().countArrangementVer2(12));
		System.out.println("n=13: "+ countArrangementVer1(13) + " " + new Task3().countArrangementVer2(13));
		System.out.println("n=14: "+ countArrangementVer1(14) + " " + new Task3().countArrangementVer2(14));
		System.out.println("n=15: "+ countArrangementVer1(15) + " " + new Task3().countArrangementVer2(15));
	}

}

