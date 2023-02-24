package io.github.linogt.vendas.validation.constraintvalidation;

import java.util.List;

import io.github.linogt.vendas.validation.NotEmptyList;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NotEmptyListValidator
	implements ConstraintValidator<NotEmptyList, List> {

	@Override
	public boolean isValid(List list,
                   ConstraintValidatorContext constraintValidatorContext) {
		return list != null && !list.isEmpty();
	}

	@Override
	public void initialize( NotEmptyList constraintAnnotation ) {}
}
