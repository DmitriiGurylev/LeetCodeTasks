import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

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

class Solution {
	public int countArrangement(int n) {
		int count = 0;
		Set<Integer> set;

		if (n == 1) {
			return ++count;
		}

		if (n >= 2) {
			for (int i1 = 1; i1 < n + 1; i1++) {
				set = new HashSet<>(n);
				set.add(i1);
				for (int i2 = 1; i2 < n + 1; i2++) {
					set = new HashSet<>();
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
							set = new HashSet<>();
							set.add(i1);
							set.add(i2);
							if (set.contains(i3)) {
								continue;
							} else if (i3 % 3 == 0 || 3 % i3 == 0) {
								set.add(i3);
								if (n == 3)
									count++;
							} else {
								continue;
							}
							if (n >= 4) {
								for (int i4 = 1; i4 < n + 1; i4++) {
									set = new HashSet<>();
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
											set = new HashSet<>();
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
													set = new HashSet<>();
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
															set = new HashSet<>();
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
																	set = new HashSet<>();
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
																			set = new HashSet<>();
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
																					set = new HashSet<>();
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
																							set = new HashSet<>();
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
																									set = new HashSet<>();
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
																											set = new HashSet<>();
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
																													set = new HashSet<>();
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
																															set = new HashSet<>();
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
																															} else if (i15 % 15 == 0 || 15 % i15 == 0) {
																																set.add(i15);
																																count++;
																															} else {
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

	public int countArrangement1(int n) {
		int count = 0;
		HashSet<Integer> set;

		if (n == 1) {
			return ++count;
		}


		if (n >= 2) {
			for (int i1 = 1; i1 < n + 1; i1++) {
				set = new HashSet<>(n);
				set.add(i1);
				count += countAdd(n, 3, set, count, n);
			}
		}
		return count;
	}

	public int countAdd(int nNew, int n, HashSet <Integer> set, int count, int limit) {
		if (limit==n)
			return count;
		if (nNew >= n) {
			for (int i = 1; i < n + 1; i++) {
				HashSet<Integer> newSet = new HashSet<>(set);
				set.clear();
				set.addAll(newSet);
				if (set.contains(i)) {
					continue;
				} else if (i % n == 0 || n % i == 0) {
					set.add(i);
					if (n == 5)
						count++;
				} else {
					continue;
				}
				countAdd(nNew, n+1, set, count, limit);
			}
		}
		return count;
	}
}

public class Task3 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.countArrangement(1));
		System.out.println(sol.countArrangement(2));
		System.out.println(sol.countArrangement(3));
		System.out.println(sol.countArrangement(4));
		System.out.println(sol.countArrangement(5));
		System.out.println(sol.countArrangement(6));
		System.out.println(sol.countArrangement(7));
		System.out.println(sol.countArrangement(9));
		System.out.println(sol.countArrangement(10));
		System.out.println(sol.countArrangement(11));
		System.out.println(sol.countArrangement(12));
		System.out.println(sol.countArrangement(13));
		System.out.println(sol.countArrangement(14));
		System.out.println(sol.countArrangement(15));
		System.out.println(sol.countArrangement1(5));


	}
}

