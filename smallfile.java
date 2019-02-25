package org.codacy.pages.web;

import org.codacy.framework.web.BaseWebPage;
import org.codacy.pages.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CodePatterns extends BaseWebPage {

    private static final String ENGINE_CONTAINER = "engine-container";
    private static final String CODE_PATTERN_CSSLINT = "item-engine-csslint";
    private static final String CSSLINT_SWITCH = "//*[@for=\"project-engine-997201eb-0907-4823-87c0-a8f7703531e7\"]";
    private static final String CODE_PATTERN_CHECKSTYLE_85 = "item-engine-checkstyle";
    private static final String CHECKSTYLE_85_SWITCH = "//*[@for=\"project-engine-f4a54ce0-1fe1-4bc7-a9ed-9f91f675c409\"]";
    private static final String CODE_PATTERN_CODACY_SCALAMETA = "item-engine-codacy-scalameta-pro";
    private static final String CODACY_SCALAMETA_SWITCH = "//*[@for=\"project-engine-647dddc1-17c4-4840-acea-4c2c2bbecb45\"]";
    private static final String CODE_PATTERN_ESLINT = "item-engine-eslint";
    private static final String ESLINT_SWITCH = "//*[@for=\"project-engine-cf05f3aa-fd23-4586-8cce-5368917ec3e5\"]";
    private static final String CODE_PATTERN_JSHINT = "item-engine-jshint";
    private static final String JSLINT_SWITCH = "//*[@for=\"project-engine-0c5f0040-53b7-11e3-8f96-0800200c9a66\"]";
    private static final String CODE_PATTERN_PMD = "item-engine-pmd-(legacy)";
    private static final String CODE_PATTERN_SCSSLINT = "item-engine-scsslint";
    private static final String SCSSLINT_SWITCH = "//*[@for=\"project-engine-2509a374-20b5-431c-8aea-f6db4f434ca7\"]";
    private static final String CODE_PATTERN_SCALASTYLE = "item-engine-scalastyle";
    private static final String SCALASTYLE_SWITCH = "//*[@for=\"project-engine-21586cd3-3eaa-4454-878e-ac0211a833c2\"]";
    private static final String CODE_PATTERN_STYLELINT = "item-engine-stylelint";
    private static final String STYLELINT_SWITCH = "//*[@for=\"project-engine-1f03328a-086e-459e-bfa3-73e56f01020f\"]";
    private static final String CODE_PATTERN_SHELLCHECK = "item-engine-shellcheck";
    private static final String SHELLCHECK_SWITCH = "//*[@for=\"project-engine-233f8aac-4fb6-4193-8a17-e64515bea152\"]";
    private static final String UNSUPPORTED_ENGINES = "unsupported-engines";
    private static final String UNSUPPORTED_ENGINES_DROPDOWN = "//*[@href=\"#unsupported-engines-list\"]";
    private static final String UNSUPPORTED_ENGINES_LIST = "unsupported-engines-list";
    private static final String ENGINE_DESCRIPTION_CONTAINER = "engine_description";
    private static final String YOUR_RULES_HEADER = "header";
    private static final String CONFIGURATION_TOOL_PATTERN_LIST = "btn-configuration-engine";
    private static final String CONFIGURATION_FILE = "btn-configuration-file";
    private static final String PATTERN_AVOID_ADJOINING_CLASSES = "pattern-3496";
    private static final String PATTERN_AVOID_OVERQUALIFIED_ELEMENTS = "pattern-3497";
    private static final String PATTERN_ABBREVIATIONASWORDINNAME = "pattern-2574";
    private static final String PATTERN_ABSTRACTCLASSNAME = "pattern-5101";
    private static final String PATTERN_AVOID_CONTROL_FLOW_INSIDE_FINALLY = "pattern-2054";
    private static final String PATTERN_AVOID_DIRECT_PROMISE_CREATION = "pattern-1086";
    private static final String PATTERN_ESLINT_ANGULAR_ANGULARELEMENT = "pattern-3388";
    private static final String PATTERN_ESLINT_ANGULAR_COMPONENT_LIMIT = "pattern-3269";
    private static final String PATTERN_YCLOMATIC_COMPLEXITY = "pattern-1172";
    private static final String PATTERN_ENFORCE_CAMEL_CASE = "pattern-1152";
    private static final String PATTERN_RETURN_BREAK = "pattern-4291";
    private static final String PATTERN_GETX_METHOD = "pattern-1478";
    private static final String PATTERN_ENFORCE_CLASS_NAMING_CONVENTION = "pattern-1326";
    private static final String PATTERN_ENFORCE_CURLY_BRACES = "pattern-1346";
    private static final String PATTERN_ENFORCE_ESCAPING_SEQUENCES = "pattern-3112";
    private static final String PATTERN_ENFORCE_SIMPLIFICATION_OF_SEARCH = "pattern-3107";
    private static final String FILTER_CONTAINER = "filter-container";
    private static final String CONFIGURATION_CONTAINER = "configuration-container";
    private static final String CONFIGURATION_PATTERN_CONTAINER = "pattern-container";
    private static final String CODE_PATTERN_FINDBUGS = "//*[contains(text(),'Findbugs')]";
    private static final String CODE_PATTERN_FINDBUGS_SECURITY = "//*[contains(text(),'Findbugs Security')]";
    private static final String CATEGORY_COMPATIBILITY = "item-add-filter-compatibility";
    private static final String CATEGORY_PERFORMANCE = "item-add-filter-performance";
    private static final String CATEGORY_CODESTYLE = "item-add-filter-code-style";
    private static final String CATEGORY_ERRORPRONE = "item-add-filter-error-prone";
    private static final String ACTIVE_ENABLE = "item-add-filter-enabled";
    private static final String ACTIVE_DISABLE = "item-add-filter-disabled";
    private static final String CONFIGURATION_PATTERN_CONTAINER_HEADER = "pattern-container-header";
    private static final String CONFIGURATION_PATTERN_CONTAINER_BODY = "pattern-container-header";
    private static final String CODE_PATTERN_REMARKLINK = "item-engine-remarklint";



    public CodePatterns(RemoteWebDriver driver, Environment env) {
        super(driver, env);
    }

    public void validateEngineContainer() {
        getElementWhenVisible(By.id(ENGINE_CONTAINER)).isDisplayed();
        getElementWhenVisible(By.id(CODE_PATTERN_CSSLINT)).isDisplayed();
        getElementWhenVisible(By.xpath(CSSLINT_SWITCH)).isDisplayed();
        getElementWhenVisible(By.id(CODE_PATTERN_CHECKSTYLE_85)).isDisplayed();
        getElementWhenVisible(By.xpath(CHECKSTYLE_85_SWITCH)).isDisplayed();
        getElementWhenVisible(By.id(CODE_PATTERN_CODACY_SCALAMETA)).isDisplayed();
        getElementWhenVisible(By.xpath(CODACY_SCALAMETA_SWITCH)).isDisplayed();
        getElementWhenVisible(By.id(CODE_PATTERN_ESLINT)).isDisplayed();
        getElementWhenVisible(By.xpath(ESLINT_SWITCH)).isDisplayed();
        getElementWhenVisible(By.id(CODE_PATTERN_JSHINT)).isDisplayed();
        getElementWhenVisible(By.xpath(JSLINT_SWITCH)).isDisplayed();
        getElementWhenVisible(By.id(CODE_PATTERN_SCSSLINT)).isDisplayed();
        getElementWhenVisible(By.xpath(SCSSLINT_SWITCH)).isDisplayed();
        getElementWhenVisible(By.id(CODE_PATTERN_SCALASTYLE)).isDisplayed();
        getElementWhenVisible(By.xpath(SCALASTYLE_SWITCH)).isDisplayed();
        getElementWhenVisible(By.id(CODE_PATTERN_STYLELINT)).isDisplayed();
        getElementWhenVisible(By.xpath(STYLELINT_SWITCH)).isDisplayed();
        getElementWhenVisible(By.id(CODE_PATTERN_SHELLCHECK)).isDisplayed();
        getElementWhenVisible(By.xpath(SHELLCHECK_SWITCH)).isDisplayed();
    }

    public void validateUnsupportedEngines() {
        getElementWhenVisible(By.id(UNSUPPORTED_ENGINES)).isDisplayed();
        getElementWhenClickable(By.xpath(UNSUPPORTED_ENGINES_DROPDOWN)).click();
        getElementWhenVisible(By.id(UNSUPPORTED_ENGINES_LIST)).isDisplayed();

    }

    public void validateEngineDescription() {
        getElementWhenVisible(By.id(ENGINE_DESCRIPTION_CONTAINER)).isDisplayed();

    }

    public void validateSelectCointainer() {

        getElementWhenVisible(By.id(YOUR_RULES_HEADER)).isDisplayed();
        getElementWhenVisible(By.id(CONFIGURATION_TOOL_PATTERN_LIST)).isDisplayed();
        getElementWhenVisible(By.id(CONFIGURATION_FILE)).isDisplayed();
    }

    public void selectCssLint() {
        getElementWhenClickable(By.id(CODE_PATTERN_CSSLINT)).click();
    }

    public void validateCssLintPatterns() {
        getElementWhenVisible(By.id(PATTERN_AVOID_ADJOINING_CLASSES)).isDisplayed();
        getElementWhenVisible(By.id(PATTERN_AVOID_OVERQUALIFIED_ELEMENTS)).isDisplayed();
    }

    public void selectCheckstyle85() {
        getElementWhenVisible(By.id(CODE_PATTERN_CHECKSTYLE_85)).click();
    }

    public void validateCheckstyle85Pattern() {
        getElementWhenVisible(By.id(PATTERN_ABBREVIATIONASWORDINNAME)).isDisplayed();
        getElementWhenVisible(By.id(PATTERN_ABSTRACTCLASSNAME)).isDisplayed();
    }

    public void selectScalaMetaPro() {
        getElementWhenVisible(By.id(CODE_PATTERN_CODACY_SCALAMETA)).click();
    }

    public void validateScalaMetPro() {
        getElementWhenVisible(By.id(PATTERN_AVOID_CONTROL_FLOW_INSIDE_FINALLY)).isDisplayed();
        getElementWhenVisible(By.id(PATTERN_AVOID_DIRECT_PROMISE_CREATION)).isDisplayed();
    }

    public void selectESLINT() {
        getElementWhenVisible(By.id(CODE_PATTERN_ESLINT)).click();
    }


    public void validateESLINT() {
        getElementWhenVisible(By.id(PATTERN_ESLINT_ANGULAR_ANGULARELEMENT)).isDisplayed();
        getElementWhenVisible(By.id(PATTERN_ESLINT_ANGULAR_COMPONENT_LIMIT)).isDisplayed();

    }

    public void selectJSHINT() {

        getElementWhenVisible(By.id(CODE_PATTERN_JSHINT)).click();
    }

    public void validateJSHINT() {
        getElementWhenVisible(By.id(PATTERN_YCLOMATIC_COMPLEXITY)).isDisplayed();
        getElementWhenVisible(By.id(PATTERN_ENFORCE_CAMEL_CASE)).isDisplayed();

    }

    public void selectPMD() {

        getElementWhenClickable(By.id(CODE_PATTERN_PMD)).click();
    }

    public void validatePMD() {
        getElementWhenVisible(By.id(PATTERN_RETURN_BREAK)).isDisplayed();
        getElementWhenVisible(By.id(PATTERN_GETX_METHOD)).isDisplayed();
    }

    public void selectSCALASTYLE() {
        getElementWhenClickable(By.id(CODE_PATTERN_SCALASTYLE)).click();
    }

    public void validateSCALASTYLE() {
        getElementWhenVisible(By.id(PATTERN_ENFORCE_CLASS_NAMING_CONVENTION)).isDisplayed();
        getElementWhenVisible(By.id(PATTERN_ENFORCE_CURLY_BRACES)).isDisplayed();
    }

    public void selectSTYLELINT() {

        getElementWhenClickable(By.id(CODE_PATTERN_STYLELINT)).click();
    }

    public void selectSHELLCHECK() {

        getElementWhenClickable(By.id(CODE_PATTERN_SHELLCHECK)).click();

    }

    public void selectRemarkLint(){
        getElementWhenClickable(By.id(CODE_PATTERN_REMARKLINK)).click();
    }

    public void validateSHELLCHECK() {
        getElementWhenVisible(By.id(PATTERN_ENFORCE_ESCAPING_SEQUENCES)).isDisplayed();
        getElementWhenVisible(By.id(PATTERN_ENFORCE_SIMPLIFICATION_OF_SEARCH)).isDisplayed();
    }

    public void validateFilterContainer() {
        getElementWhenVisible(By.id(FILTER_CONTAINER)).isDisplayed();
    }

    public void validateFilterSpecificContainer() {
        getElementWhenVisible(By.id(FILTER_CONTAINER)).isDisplayed();
        getElementWhenVisible(By.id(CATEGORY_COMPATIBILITY)).isDisplayed();
        getElementWhenVisible(By.id(CATEGORY_PERFORMANCE)).isDisplayed();
        getElementWhenVisible(By.id(CATEGORY_CODESTYLE)).isDisplayed();
        getElementWhenVisible(By.id(CATEGORY_ERRORPRONE)).isDisplayed();
        getElementWhenVisible(By.id(ACTIVE_ENABLE)).isDisplayed();
        getElementWhenVisible(By.id(ACTIVE_DISABLE)).isDisplayed();
    }

    public void validateGenericPatternContainer() {
        getElementWhenVisible(By.id(CONFIGURATION_CONTAINER)).isDisplayed();
        getElementWhenVisible(By.id(CONFIGURATION_PATTERN_CONTAINER)).isDisplayed();
        getElementWhenVisible(By.id(CONFIGURATION_PATTERN_CONTAINER_HEADER)).isDisplayed();
        getElementWhenVisible(By.id(CONFIGURATION_PATTERN_CONTAINER_BODY)).isDisplayed();
    }

    public void selectFindbugs() {
        getElementWhenClickable(By.xpath(CODE_PATTERN_FINDBUGS));
    }

    public void selectFindBugsSecurity() {
        getElementWhenClickable(By.xpath(CODE_PATTERN_FINDBUGS_SECURITY));
    }
}
