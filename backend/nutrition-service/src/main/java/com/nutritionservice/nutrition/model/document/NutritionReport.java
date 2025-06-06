package com.nutritionservice.nutrition.model.document;

import com.nutritionservice.nutrition.model.dto.analysis.NutrientResult;
import com.nutritionservice.nutrition.model.dto.external.IngredientDetail;
import com.nutritionservice.nutrition.model.dto.external.TopRisk;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Document("report")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NutritionReport {

    @Id
    private String id;

    private String userId;
    private String productId;
    private String productName;
    private String ingredientImageUrl;
    private String nutritionImageUrl;
    private LocalDateTime analyzedAt;

    private int kcal;
    private int giIndex;
    private String giGrade;
    private Map<String, NutrientResult> ratios;

    private Map<String, List<IngredientDetail>> categorizedIngredients;
    private List<TopRisk> topRisks;

    private String nutritionSummary;
    private String ingredientSummary;


    public static NutritionReport from(
            String userId,
            ProductNutrition product,
            Map<String, NutrientResult> ratios,
            Map<String, List<IngredientDetail>> categorizedIngredients,
            List<TopRisk> topRisks
    ) {
        return NutritionReport.builder()
                .userId(userId)
                .productId(product.getId().toHexString())
                .productName(product.getName())
                .nutritionImageUrl(product.getNutritionImageUrl())
                .ingredientImageUrl(product.getIngredientImageUrl())
                .analyzedAt(LocalDateTime.now())
                .kcal(product.getResult().getNutritionAnalysis().getNutrition().getKcal())
                .giIndex(product.getResult().getIngredientAnalysis().getGiIndex().getValue())
                .giGrade(product.getResult().getIngredientAnalysis().getGiIndex().getGrade())
                .ratios(ratios)
                .categorizedIngredients(categorizedIngredients)
                .topRisks(topRisks)
                .nutritionSummary(product.getResult().getNutritionAnalysis().getSummary())
                .ingredientSummary(product.getResult().getIngredientAnalysis().getSummary())
                .build();
    }

}