{
  const {
    html,
  } = Polymer;
  /**
    `<glomo-unavailable-operation-manager>` Description.

    Example:

    ```html
    <glomo-unavailable-operation-manager></glomo-unavailable-operation-manager>
    ```

    ## Styling
    The following custom properties and mixins are available for styling:

    ### Custom Properties
    | Custom Property     | Selector | CSS Property | Value       |
    | ------------------- | -------- | ------------ | ----------- |
    | --cells-fontDefault | :host    | font-family  |  sans-serif |
    ### @apply
    | Mixins    | Selector | Value |
    | --------- | -------- | ----- |
    | --glomo-unavailable-operation-manager | :host    | {} |

    * @customElement glomo-unavailable-operation-manager
    * @polymer
    * @extends {Polymer.Element}
    * @demo demo/index.html
  */
  class GlomoUnavailableOperationManager extends Polymer.mixinBehaviors([ CellsBehaviors.i18nBehavior, ], Polymer.Element) {
    static get is() {
      return 'glomo-unavailable-operation-manager';
    }

    static get properties() {
      return {
        /**
         * Type of the page, to types available: 'goBack' and 'understood'
         * @type {Object}
         */
        type: {
          type: String
        },
        /**
         * It is used to determine the event to be launched depending on where the page is opened from
         * Its true when the page is opened from landing page flow and false when is opened from another page
         * If its true will fire an event to continue with the landing page flow
         * Otherwise will fire an event to perform back navigation
         * @type {Boolean}
         * @default false
         */
        _isLandingPageFlow: {
          type: Boolean,
          value: false
        }
      };
    }

    /**
     * Fires event on init
     * @event stand-in-modal-hide-text-description
     */
    init() {
      this._dispatch('stand-in-modal-hide-text-description', false);
    }

    /**
     * Sets the navigation to landing page flow
     */
    setNavigationFromLanding() {
      this._isLandingPageFlow = true;
    }

    /**
     * Sets the navigation to normal flow
     */
    setNavigation() {
      this._isLandingPageFlow = false;
    }

    /**
     * Dispatches the event to go back
     * @event stand-in-modal-go-back
     * @event stand-in-modal-landing-page-next-flow
     */
    backNavigation() {
      const backEvent = this._isLandingPageFlow
        ? 'stand-in-modal-landing-page-next-flow'
        : 'stand-in-modal-go-back';

      this._dispatch(backEvent, {});
    }

    sendTexts(payload) {
      var id = this.get('id', payload);
      var buttonConfig = {
        buttons: {
          primary: {
            action: 'ok'
          }
        }
      };
      if (this.type === 'goBack') {
        this._dispatch('header-left-icon', 'coronita:return-12');
        this._dispatch('header-right-icon', '');
        buttonConfig.buttons.primary.text = this.t('glomo-unavailable-operation-manager-button-text-go-back');
      } else {
        this._dispatch('header-left-icon', '');
        this._dispatch('header-right-icon', 'coronita:close');
        buttonConfig.buttons.primary.text = this.t('glomo-unavailable-operation-manager-button-text-understood');
      }
      this._dispatch('button-config', buttonConfig);
      this._dispatch('panel-heading', this.t('glomo-unavailable-operation-manager-heading'));
      this._dispatch('panel-title', this.t(`glomo-unavailable-operation-manager-title-${id}`));
      this._dispatch('panel-text', this.t(`glomo-unavailable-operation-manager${id ? `-description-${id}` : '-text'}`));
      this._dispatch('panel-linktext', this.t('glomo-unavailable-operation-manager-linktext'));
    }

    setLimitedOperativeStandInTexts() {
      this._dispatch('set-stand-in-limited-operative-heading-title-one', this.t('glomo-limited-operatives-info-page-list-clip-title1'));
      this._dispatch('set-stand-in-limited-operative-heading-title-two', this.t('glomo-limited-operatives-info-page-list-clip-title2'));
      this._dispatch('set-stand-in-limited-operative-text-content-one', this.t('glomo-limited-operatives-info-page-text-content-title1'));
      this._dispatch('set-stand-in-limited-operative-text-content-two', this.t('glomo-limited-operatives-info-page-text-content-title2'));
    }

    /**
     * Dispatches the modal content coming from appSettings
     * @param {Object} appSettings
     * @param {Array} appSettings.standInModal
     * @event stand-in-modal-dynamic-title
     * @event stand-in-modal-dynamic-main-paragraph
     * @event stand-in-modal-dynamic-secondary-paragraph
     */
    setContentSettings({ standInModal = [] } = {}) {
      const defaultTitle = this.t('glomo-stand-in-modal-post-loggin-title');
      const defaultParagraph = '';

      const [ contentToShow ] = standInModal.filter(content => content?.show);

      const title = contentToShow?.title ?? defaultTitle;
      const mainParagraph = contentToShow?.mainParagraph ?? defaultParagraph;
      const secondParagraph = contentToShow?.secondParagraph ?? defaultParagraph;

      this._dispatch('stand-in-modal-dynamic-title', title);
      this._dispatch('stand-in-modal-dynamic-main-paragraph', mainParagraph);
      this._dispatch('stand-in-modal-dynamic-secondary-paragraph', secondParagraph);
    }

    _dispatch(eventName, detail) {
      this.dispatchEvent(new CustomEvent(eventName, {
        bubbles: true,
        composed: true,
        detail
      }));
    }
  }

  customElements.define(GlomoUnavailableOperationManager.is, GlomoUnavailableOperationManager);
}