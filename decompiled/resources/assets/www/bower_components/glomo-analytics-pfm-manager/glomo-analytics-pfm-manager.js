/*
  # &lt;glomo-analytics-pfm-manager&gt;

  ![Polymer 2.x](https://img.shields.io/badge/Polymer-2.x-green.svg)
  Example:

  ```html
  <glomo-analytics-pfm-manager></glomo-analytics-pfm-manager>
  ```

  ## Dependencies

  - [polymer](https://polymer-library.polymer-project.org/2.0/docs/devguide/feature-overview)
  - [glomo-analytics-manager-mixin](https://globaldevtools.bbva.com/bitbucket/projects/GLOMO/repos/glomo-analytics-manager-mixin/browse)

  **Properties**:

  | Name                      | Type    | Description                                                                                         | Binding |
  | ------------------------- | ------- | --------------------------------------------------------------------------------------------------- | ------- |
  | appStartedEventWasEmitted | Boolean | Flag to check if AppStarted event type was emitted.                                                 | IN      |
  | showTrendsChart           | Boolean | Flag that helps to know which kind of graph is shown on the pfmaggregation manager: lineal or bars. | IN      |
  | pfmAggregationDynamicData | Object  | Different properties that are needed to inform about page view events on pfmaggregation view.       | IN      |
  | tabData                   | Object  | Configuration object that helps to know which tab has been selected.                                | IN      |
  | selectedTabData           | String  | Variable that informs about which tab has been selected.                                            | IN      |
  | onStartEventSuffix        | String  | Flag to be used in OnStartEvent analytic events, to complete the name of the event to throw.        | IN      |

  **Methods**:

  | Name                          | Description                                                                                               | Input           | Output |
  | ----------------------------- | --------------------------------------------------------------------------------------------------------- | --------------- | ------ |
  | reset                         | Function to reset data.                                                                                   |                 |        |
  | fireAppStarted                | Fires app started event with the information passed by parameter. This kind of event is only thrown once. | applicationStep |        |
  | firePageView                  | Fires page view event.                                                                                    |                 |        |
  | fireOnStartEvent              | Fires a new event when user clicks on the button that starts a funnel.                                    |                 |        |
  | firePfmAggregationPageView    | Fires a page view event taking into account the information passed by parameters.                         | data            |        |
  | firePageViewWithTabConfig     | Fires a page view event taking into account the information passed by parameters. For tab window support. | tabIndex        |        |
  | fireOnStartEventWithTabConfig | Fires a new event when user clicks on the button that starts a funnel.                                    |                 |        |
  | firePageInteraction           | Fires a page interaction event.                                                                           | data            |        |
  | addAnalyticData               | Persists the analytic data that is informed on a certain step of the opx form.                            |                 |        |
  | firePageVisit                 | Fires page visit event and send data.                                                                     |                 |        |
  | fireStepLoaded                | Fires current step analytics when load page.                                                              |                 |        |

  **Events**:

  | Name                                                                | Description                                                                                 | Data |
  | ------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ---- |
  | analytics-page-view                                                 | It is used to inform about page-view type analytic event.                                   |      |
  | analytics-page-view-pfmaggregation-${chartType}-${taxonomyType}     | It is used to inform about page-view event, according to what pfmaggregation page is shown. |      |
  | analytics-page-view-tab-selected-\${eventSuffix}                    | It is used to inform about page-view event, according to what tab is selected.              |      |
  | analytics-page-interaction                                          | It is used to inform when an user has interacted with a part of the page.                   | data |
  | analytics-page-on-start-event-\${this.onStartEventSuffix}           | It is used to inform about page-on-start type analytic event.                               |      |
  | analytics-page-on-start-event-tab-selected-\${this.selectedTabData} | It is used to inform about page-view event, according to what tab is selected.              |      |
  | analytics-page-visit                                                | It is used to inform about page-visit type analytic event.                                  |      |
  | analytics-\${this.config.steps[this.currentStep]}                   | Dynamic event that is thrown when a certain opx step is shown.                              |      |


*/
/*eslint new-cap: [2, {"capIsNewExceptions": ["GlomoAnalyticsManagerMixin", "GlomoAnalyticsManagerMixinStep"]}]*/
class GlomoAnalyticsPfmManager extends CellsBehaviors.GlomoAnalyticsManagerMixin(
  CellsBehaviors.GlomoAnalyticsManagerMixinStep(Polymer.Element)) {

  static get is() {
    return 'glomo-analytics-pfm-manager';
  }

  static get properties() {
    return {
      /**
       * Flag to check if AppStarted event type was emitted.
       * This kind of event is only thrown once.
       */
      appStartedEventWasEmitted: {
        type: Boolean,
        value: false
      },
      /**
       * Flag that helps to know which kind of graph is shown on the pfmaggregation manager: lineal or bars.
       */
      showTrendsChart: {
        type: Boolean,
        value: false
      },
      /**
       * Different properties that are needed to inform about page view events on pfmaggregation view.
       * Properties like expenses, categories or subcategories are expected.
       */
      pfmAggregationDynamicData: {
        type: Object,
        value: () => ({
          expenses: '',
          categories: '',
          subcategories: ''
        })
      },
      /**
       * Different properties that are needed to inform about the custom fields analytic property.
       */
      customFieldsPrefix: {
        type: Object,
        value: () => ({})
      },
      /**
       * Configuration object that helps to know which tab has been selected.
       */
      tabData: {
        type: Object,
        value: () => ({})
      },
      /**
       * Variable that informs about which tab has been selected.
       */
      selectedTabData: {
        type: String,
        value: ''
      },
      /**
       * Flag to be used in OnStartEvent analytic events, to complete the name of the event to throw.
       */
      onStartEventSuffix: {
        type: String,
        value: 'default'
      },
      /**
       * Flag to be used in OnStartEvent Budgets analytic events, to complete the name of the event to throw.
       */
      onStartEventBudgetsSuffix: {
        type: String,
        value: 'default'
      },
      /**
       * Flag to be used in OnStartEvent Budgets analytic events, to complete the name of the event to throw.
       */
      onStartEventRecategorizationSuffix: {
        type: String,
        value: 'default'
      },
      /**
       * Maximum number of events that can be fired.
       */
      maxValueEventsFired: {
        type: Number,
        value: 3
      },
      /**
       * Group id to be used in the analytic events.
       */
      groupId: {
        type: String,
        value: '1'
      },
      /**
       * titleGroupId id to be used in the analytic events.
       */
      titleGroupId: {
        type: Object,
        value: {
          1: 'gasto total',
          2: 'ingreso total',
          3: 'actividad financiera'
        }
      },
      /**
       * Private variable that informs about the category (id and name) of the budget.
       */
      _category: {
        type: String,
      },
      /**
       * Private variable that informs about the subcategory (id and name) of the budget.
       */
      _subCategory: {
        type: String,
      },
      /**
       * Private variable that informs about the period of the budget.
       */
      _period: {
        type: Object
      },
      /**
       * Private variable that informs about the amount of the budget.
       */
      _amount: {
        type: String,
      },
      /**
       * Object that is populated with the information to be used on analytics.
       * @type {Array}
       */
      _budgetAnalyticsData: {
        type: Object,
        value: () => ({}),
      },
      /*
       * Flag to be used in OnStartEvent analytic events, to complete the name of the event to throw.
       */
      categorySelected: {
        type: String,
        value: ''
      },
      _maxEventsFired: {
        type: Number,
        value: 0
      },
      _historyPayload: {
        type: Object,
        value: () => ({}),
      }
    };
  }

  /**
   * Function to reset data
   */
  reset() {
    this.appStartedEventWasEmitted = false;
    this._maxEventsFired = 0;
  }

  /**
   * Fires app started event with the information passed by parameter.
   * This kind of event is only thrown once.
   * @param {String} applicationStep
   */
  fireAppStarted(applicationStep) {
    if (!this.appStartedEventWasEmitted) {
      this.appStartedEventWasEmitted = true;
      super.fireAppStarted(applicationStep);
    }
  }

  /**
   * Fires a page view event.
   * @event analytics-page-view It is used to inform about page-view type analytic event.
   */
  firePageView() {
    this._dispatch('analytics-page-view');
  }

  /**
   * Fires a new event when user clicks on the button that starts a funnel.
   * @event analytics-page-on-start-event-${this.onStartEventSuffix} It is used to inform about page-on-start type analytic event.
   */
  fireOnStartEvent() {
    this._dispatch(`analytics-page-on-start-event-${this.onStartEventSuffix}`);
  }

  /**
   * Fires a new event when user clicks on the button that starts a funnel.
   * @event analytics-page-on-start-event-${this.onStartEventSuffix} It is used to inform about page-on-start type analytic event.
   */
  fireOnStartBudgetsEvent() {
    this._dispatch(`analytics-page-on-start-budgets-event-${this.onStartEventBudgetsSuffix}`);
  }

  /**
   * Fires a new event when user clicks on the button that starts a funnel.
   * @event analytics-page-on-start-event-${this.onStartEventSuffix} It is used to inform about page-on-start type analytic event.
   */
  fireCreateBudgetsEvent() {
    if (!this._maxEventsFired) {
      this._dispatch(`analytics-page-on-start-budgets-event-${this.onStartEventBudgetsSuffix}`);
      this._dispatch('analytics-page-visit');
    }
    this._maxEventsFired++;
    if (this.maxValueEventsFired === this._maxEventsFired) {
      this._maxEventsFired = 0;
    }
  }

  /**
   * Fires a new event when user clicks on the button that starts a funnel.
   * @event analytics-page-on-start-event-${this.onStartEventSuffix} It is used to inform about page-on-start type analytic event.
   */
  fireOnStartRecatecorizationEvent() {
    this._dispatch(`analytics-page-on-start-recategorization-event-${this.onStartEventRecategorizationSuffix}`);
  }
  /**
   * Fires a page view event taking into account the information passed by parameters.
   * This function is specially created to support pfmaggregation life cicle events.
   * @param {Object} data Contains the type and name of the taxonomy to be informed.
   * @event analytics-page-view-pfmaggregation-${chartType}-${taxonomyType} It is used to inform about page-view event, according to what pfmaggregation page is shown.
   */
  firePfmAggregationPageView(data) {
    const taxonomyType = data && data.state || '';
    const taxonomyName = data && data.name || '';
    const chartType = this.showTrendsChart ? 'trends' : 'lineal';
    const level3TaxonomyName = taxonomyType !== 'expenses' ? taxonomyName : '';

    const level3Data = this.pfmAggregationDynamicData[taxonomyType] + level3TaxonomyName;
    const payload = {
      level3: level3Data,
    };

    const normalizedPayload = this._normalizeObjectData(payload);
    this._dispatch(`analytics-page-view-pfmaggregation-${chartType}-${taxonomyType}`, normalizedPayload);
  }

  /**
   * Fires a page view event taking into account the information passed by parameters.
   * This function is specially created to support those pages which contains tabs on it.
   * @param {Number} tabIndex Identifier of the tab that is selected in the pfm period page.
   * @event analytics-page-view-tab-selected-${selectedTabData} It is used to inform about page-view event, according to what tab is selected.
   */
  firePageViewWithTabConfig(tabIndex) {
    tabIndex = tabIndex?.selectedIndex === 0 || tabIndex?.selectedIndex ? tabIndex.selectedIndex : tabIndex;
    this.selectedTabData = this.tabData[tabIndex] || '';
    this._dispatch(`analytics-page-view-tab-selected-${this.selectedTabData}`);
  }

  /**
   * Fires a new event when user clicks on the button that starts a funnel.
   * This function will take the information of the selected tabData.
   * @event analytics-page-on-start-event-${this.selectedTabData} It is used to inform about page-on-start type analytic event.
   */
  fireOnStartEventWithTabConfig() {
    this._dispatch(`analytics-page-on-start-event-tab-selected-${this.selectedTabData}`);
  }

  /**
   * Fires a page interaction event.
   * @param {Object} data Contains information about the element that user has interacted.
   * In case that this function is used on vertical chart interaction, this value will contain the selected month.
   * @event analytics-page-interaction It is used to inform when an user has interacted with a part of the page.
   */
  firePageInteraction(data) {
    const payload = {
      interactionLevel: data && data.selectedMonth && data.selectedMonth.category || ''
    };

    this._dispatch('analytics-page-interaction', payload);
  }

  /**
   * Persists the analytic data that is informed on a certain step of the recategorize form.
   * @param {Object} data Data to be persisted.
   */
  addRecategorizeAnalyticData(data) {
    if (this.customFieldsPrefix.subcategory && data.newSubcategoryName) {
      data.newSubcategoryName = this.customFieldsPrefix.subcategory + ':' + data.newSubcategoryName;
    }

    this.addAnalyticData(data);
  }

  /**
   * Persists the analytic data that is informed on a certain step of the opx form.
   * @param {Object} data Data to be persisted.
   */
  addAnalyticData(data) {
    const normalizedData = this._normalizeObjectData(data);
    this.persistData(normalizedData);
  }

  /**
   * Fires page visit event and send data.
   * @event analytics-page-visit It is used to inform about page-visit type analytic event.
   */
  firePageVisit() {
    this._dispatch('analytics-page-visit', this.data);
  }

  /**
   * Fires page visit event and send data.
   * @event analytics-page-visit It is used to inform about page-visit type analytic event.
   */
  fireCategorizationPageVisit() {
    this._maxEventsFired = 0;
    let payload = {
      level2: this.titleGroupId[this.groupId],
    };

    this._dispatch('analytics-categorization-page-visit', payload);
  }

  /**
   * Fires current step analytics when load page.
   * @event analytics-{this.config.steps[this.currentStep]} Dynamic event that is thrown when a certain opx step is shown.
   */
  fireStepLoaded() {
    this._dispatch(`analytics-${this.config.steps[this.currentStep]}`, this.data);
  }
  /**
   * Fires current step analytics when in categorization tab clicks.
   * @event analytics-page-view-categorization-tab-click
   */
  fireCategorizationTabClick(detail) {
    const payload = {
      interactionLevel: 'tab ver ' + detail.info.title.toLowerCase()
    };
    if (detail.info.name) {
      payload.level2 = 'categoria';
      payload.level3 = detail.info.name;
    } else {
      payload.level2 = this.titleGroupId[this.groupId];
    }

    const normalizedPayload = this._normalizeObjectData(payload);
    this._dispatch('analytics-page-view-categorization-tab-click', normalizedPayload);
  }

  /**
   * Fires current step analytics when clicks in category.
   * @event analytics-page-view-categorization-category
   */
  categorizationCategorySelectAnalytics(detail) {
    const payload = {
      level2: 'categoria',
      level3: detail.name,
    };
    this.categorySelected = detail.name;
    const normalizedPayload = this._normalizeObjectData(payload);
    this._dispatch('analytics-page-view-categorization-category', normalizedPayload);
  }

  /**
   * Fires current step analytics when clicks in category.
   * @event analytics-page-view-categorization-category
   */
  categorizationSubCategorySelectAnalytics(detail) {
    const payload = {
      level2: 'subcategoria',
      level3: detail.name,
    };
    this.categorySelected = detail.name;
    const normalizedPayload = this._normalizeObjectData(payload);
    this._dispatch('analytics-page-view-categorization-category', normalizedPayload);
  }

  /**
   * Fires current step analytics when clicks in History view.
   * @event analytics-page-view-{detail.nameEvent} Dynamic event that is thrown when a certain opx step is shown.
   */
  fireHistoryView(detail, level = '') {
    const categoryName = detail.categoryName || this.titleGroupId[this.groupId];
    this._historyPayload = {
      name: categoryName,
      level2: level || this.titleGroupId[this.groupId],
      level3: 'historico'
    };
    this._dispatch(`analytics-page-view-${detail.nameEvent}`, this._historyPayload);
  }

  /**
   * Fires current step analytics when clicks in History view.
   * @event analytics-page-view-{detail.nameEvent} Dynamic event that is thrown when a certain opx step is shown.
   */
  fireHistoryViewCategory(detail) {
    this.fireHistoryView(detail, 'categoria');
  }

  /**
   * Fires current step analytics when clicks in History view.
   * @event analytics-page-view-{detail.nameEvent} Dynamic event that is thrown when a certain opx step is shown.
   */
  fireHistoryViewSubcategory(detail) {
    this.fireHistoryView(detail, 'subcategoria');
  }

  /**
   * Fires current step analytics when clicks in tab History view.
   * @event analytics-interaction-link-history
   */
  fireHistorySelectedTabView(detail) {
    const payload = {
      ...this._historyPayload,
      interactionLevel: `ver historico ${detail?.info?.title.toLowerCase()}`
    };
    this._dispatch('analytics-interaction-link-history', payload);
  }

  /**
   * Fires current step analytics when load page in budgets.
   * @event analytics-{e.detail} Dynamic event that is thrown when a certain opx step is shown.
   */
  fireBudgetStepLoaded(e) {
    if (typeof e === 'string') {
      this._dispatch(`analytics-${e}`, this.data);
    } else {
      this._dispatch('analytics-step-4', this.data);
    }
  }

  /**
   * Auxiliary method which normalizes all properties of given object.
   * This method will take all properties from the object and will replace all accents.
   * After that, it will also convert these properties to lower case.
   * @param {Object} data Object to be normalized
   */
  _normalizeObjectData(data) {
    let normalizedObject = {};

    if (data) {
      Object.keys(data).forEach(function(key, index) {
        normalizedObject[key] = data[key] && data[key].toString().normalize('NFD').replace(/[\u0300-\u036f]/g, '').toLowerCase();
      });
    }

    return normalizedObject;
  }

  /**
   * Calls fireAppStarted with 'categoria principal'
   */
  handleRecategorizationCategoryClick() {
    if (!this._maxEventsFired) {
      this._dispatch('analytics-app-started-creategorization-category');
    }
    this._maxEventsFired++;
    if (this.maxValueEventsFired === this._maxEventsFired) {
      this._maxEventsFired = 0;
    }
  }

  /**
   * Calls fireAppStarted with 'categoria principal'
   */
  handleCategoryClick() {
    this.addAnalyticData({applicationStep: 'categoria principal'});
    this.fireAppStarted('categoria principal');
  }

  /**
   * Calls fireAppStarted with 'subcategoria'
   */
  handleSubCategoryClick() {
    this.addAnalyticData({applicationStep: 'subcategoria'});
    this.fireAppStarted('subcategoria');
  }

  /**
   * Calls fireAppStarted with 'nombre del presupuesto'
   */
  handleBudgetNameClick() {
    this.addAnalyticData({applicationStep: 'nombre del presupuesto'});
    this.fireAppStarted('nombre del presupuesto');
  }

  /**
   * Step 1: Completes DOM object with category, subcategory and name budget
   * @param {Object} stepModel
   */
  addCategoriesName(stepModel) {
    this._category = null;
    this._subCategory = null;

    if (stepModel) {
      this._subCategory = stepModel.subcategory;
      this._category = stepModel.category;
    }

    this._updateBudgetAnalyticsData();
    this.addAnalyticData(this._budgetAnalyticsData);
    this.fireAppStarted('siguiente');
  }

  /**
   * Step 2: Completes DOM object with period
   * @param {Object} stepModel
   */
  addPeriod(stepModel) {
    this._period = null;

    if (stepModel) {
      this._period = stepModel.period;
    }

    this._updateBudgetAnalyticsData();
    this.addAnalyticData(this._budgetAnalyticsData);
  }

  /**
   * Step 3: Completes DOM object with amount
   * @param {Object} stepModel
   */
  addAmount(stepModel) {
    this.canExecute = false;
    this._amount = stepModel && stepModel.amount || null;

    this._updateBudgetAnalyticsData();
    this.addAnalyticData(this._budgetAnalyticsData);
  }

  /**
   * Auxiliary function which updates all properties of _budgetAnalyticsData object.
   */
  _updateBudgetAnalyticsData() {
    this._budgetAnalyticsData.categoryName = this._category;
    this._budgetAnalyticsData.subcategoryName = this._subCategory;
    this._budgetAnalyticsData.period = this._period;
    this._budgetAnalyticsData.budgetAmount = this._amount;
  }
}

customElements.define(GlomoAnalyticsPfmManager.is, GlomoAnalyticsPfmManager);
