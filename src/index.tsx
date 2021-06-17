import { requireNativeComponent, ViewStyle } from 'react-native';

type PickImagesProps = {
  color: string;
  style: ViewStyle;
};

export const PickImagesViewManager = requireNativeComponent<PickImagesProps>(
'PickImagesView'
);

export default PickImagesViewManager;
